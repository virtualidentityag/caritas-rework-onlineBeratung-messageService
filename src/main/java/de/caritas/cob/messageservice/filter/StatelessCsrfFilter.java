package de.caritas.cob.messageservice.filter;

import static de.caritas.cob.messageservice.config.SecurityConfig.WHITE_LIST;
import static java.util.Objects.isNull;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * This custom filter checks CSRF cookie and header token for equality
 */
public class StatelessCsrfFilter extends OncePerRequestFilter {

  private final RequestMatcher requireCsrfProtectionMatcher;
  private final AccessDeniedHandler accessDeniedHandler = new AccessDeniedHandlerImpl();
  private final String csrfCookieProperty;
  private final String csrfHeaderProperty;

  public StatelessCsrfFilter(String cookieProperty, String headerProperty,
      String csrfWhitelistHeaderProperty) {
    this.csrfCookieProperty = cookieProperty;
    this.csrfHeaderProperty = headerProperty;
    this.requireCsrfProtectionMatcher = new DefaultRequiresCsrfMatcher(csrfWhitelistHeaderProperty);
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {

    if (requireCsrfProtectionMatcher.matches(request)) {
      final String csrfTokenValue = request.getHeader(this.csrfHeaderProperty);
      String csrfCookieValue = retrieveCsrfCookieValue(request);

      if (isNull(csrfTokenValue) || !csrfTokenValue.equals(csrfCookieValue)) {
        accessDeniedHandler.handle(request, response,
            new AccessDeniedException("Missing or non-matching CSRF-token"));
        return;
      }
    }
    filterChain.doFilter(request, response);
  }

  private String retrieveCsrfCookieValue(HttpServletRequest request) {
    final Cookie[] cookies = request.getCookies();
    return isNull(cookies) ? null : Stream.of(cookies)
        .filter(cookie -> cookie.getName().equals(this.csrfCookieProperty))
        .map(Cookie::getValue)
        .findFirst()
        .orElse(null);
  }

  @RequiredArgsConstructor
  private static final class DefaultRequiresCsrfMatcher implements RequestMatcher {

    private final Pattern allowedMethods = Pattern.compile("^(HEAD|TRACE|OPTIONS)$");
    private final @NonNull String csrfWhitelistHeaderProperty;

    @Override
    public boolean matches(HttpServletRequest request) {
      return !(isWhiteListUrl(request) || isWhiteListHeader(request) || isAllowedMehod(request));
    }

    private boolean isWhiteListUrl(HttpServletRequest request) {
      return Arrays.asList(WHITE_LIST).parallelStream()
          .anyMatch(request.getRequestURI().toLowerCase()::contains);
    }

    private boolean isWhiteListHeader(HttpServletRequest request) {
      return isNotBlank(request.getHeader(this.csrfWhitelistHeaderProperty));
    }

    private boolean isAllowedMehod(HttpServletRequest request) {
      return allowedMethods.matcher(request.getMethod()).matches();
    }

  }
}
