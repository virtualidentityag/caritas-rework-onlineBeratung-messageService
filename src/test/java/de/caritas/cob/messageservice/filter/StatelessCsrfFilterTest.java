package de.caritas.cob.messageservice.filter;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.ReflectionTestUtils.setField;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.security.web.access.AccessDeniedHandler;

@RunWith(MockitoJUnitRunner.class)
public class StatelessCsrfFilterTest {

  private static final String CSRF_HEADER = "csrfHeader";
  private static final String CSRF_COOKIE = "csrfCookie";
  private static final String CSRF_WHITELIST_COOKIE = "csrfWhitelistHeader";

  private final StatelessCsrfFilter csrfFilter = new StatelessCsrfFilter(CSRF_COOKIE, CSRF_HEADER,
      CSRF_WHITELIST_COOKIE);

  @Mock
  private HttpServletRequest request;

  @Mock
  private HttpServletResponse response;

  @Mock
  private FilterChain filterChain;

  @Mock
  private AccessDeniedHandler accessDeniedHandler;

  @Before
  public void setup() {
    setField(csrfFilter, "accessDeniedHandler", accessDeniedHandler);
  }

  @Test
  public void doFilterInternal_Should_executeFilterChain_When_requestMethodIsAllowed()
      throws IOException, ServletException {
    when(request.getRequestURI()).thenReturn("uri");
    when(request.getMethod()).thenReturn("OPTIONS");

    this.csrfFilter.doFilterInternal(request, response, filterChain);

    verify(this.filterChain, times(1)).doFilter(request, response);
  }

  @Test
  public void doFilterInternal_Should_executeFilterChain_When_requestHasCsrfWhitelistHeader()
      throws IOException, ServletException {
    when(request.getRequestURI()).thenReturn("uri");
    when(request.getHeader(CSRF_WHITELIST_COOKIE)).thenReturn("whitelisted");

    this.csrfFilter.doFilterInternal(request, response, filterChain);

    verify(this.filterChain, times(1)).doFilter(request, response);
  }

  @Test
  public void doFilterInternal_Should_executeFilterChain_When_requestCsrfHeaderAndCookieAreEqual()
      throws IOException, ServletException {
    when(request.getRequestURI()).thenReturn("uri");
    when(request.getMethod()).thenReturn("POST");
    when(request.getHeader(CSRF_HEADER)).thenReturn("csrfTokenValue");
    Cookie[] cookies = {new Cookie(CSRF_COOKIE, "csrfTokenValue")};
    when(request.getCookies()).thenReturn(cookies);

    this.csrfFilter.doFilterInternal(request, response, filterChain);

    verify(this.filterChain, times(1)).doFilter(request, response);
  }

  @Test
  public void doFilterInternal_Should_callAccessDeniedHandler_When_csrfHeaderIsNull()
      throws IOException, ServletException {
    when(request.getRequestURI()).thenReturn("uri");
    when(request.getMethod()).thenReturn("POST");
    Cookie[] cookies = {new Cookie(CSRF_COOKIE, "csrfTokenValue")};
    when(request.getCookies()).thenReturn(cookies);

    this.csrfFilter.doFilterInternal(request, response, filterChain);

    verify(this.accessDeniedHandler, times(1)).handle(any(), any(), any());
    verifyNoMoreInteractions(this.filterChain);
  }

  @Test
  public void doFilterInternal_Should_callAccessDeniedHandler_When_cookiesAreNull()
      throws IOException, ServletException {
    when(request.getRequestURI()).thenReturn("uri");
    when(request.getMethod()).thenReturn("POST");
    when(request.getHeader(CSRF_HEADER)).thenReturn("csrfHeaderTokenValue");

    this.csrfFilter.doFilterInternal(request, response, filterChain);

    verify(this.accessDeniedHandler, times(1)).handle(any(), any(), any());
    verifyNoMoreInteractions(this.filterChain);
  }

  @Test
  public void doFilterInternal_Should_callAccessDeniedHandler_When_csrfHeaderIsNotEqualToCookieToken()
      throws IOException, ServletException {
    when(request.getRequestURI()).thenReturn("uri");
    when(request.getMethod()).thenReturn("POST");
    when(request.getHeader(CSRF_HEADER)).thenReturn("csrfHeaderTokenValue");
    Cookie[] cookies = {new Cookie(CSRF_COOKIE, "csrfCookieTokenValue")};
    when(request.getCookies()).thenReturn(cookies);

    this.csrfFilter.doFilterInternal(request, response, filterChain);

    verify(this.accessDeniedHandler, times(1)).handle(any(), any(), any());
    verifyNoMoreInteractions(this.filterChain);
  }

}
