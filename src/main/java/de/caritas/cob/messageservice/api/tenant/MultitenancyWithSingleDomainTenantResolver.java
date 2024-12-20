package de.caritas.cob.messageservice.api.tenant;

import java.util.Optional;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MultitenancyWithSingleDomainTenantResolver implements TenantResolver {
  @Value("${feature.multitenancy.with.single.domain.enabled}")
  private boolean multitenancyWithSingleDomain;

  @Override
  public Optional<Long> resolve(HttpServletRequest request) {
    if (multitenancyWithSingleDomain) {
      log.debug("MultitenancyWithSingleDomainTenantResolver resolves tenantId");
      return Optional.of(0L);
    } else {
      return Optional.empty();
    }
  }

  @Override
  public boolean canResolve(HttpServletRequest request) {
    return resolve(request).isPresent();
  }
}
