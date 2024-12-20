package de.caritas.cob.messageservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.caritas.cob.messageservice.api.model.AliasArgs;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.client.RestTemplate;

/**
 * Contains some general spring boot application configurations
 *
 */
@Configuration
@ComponentScan(basePackages = {"de.caritas.cob.messageservice"})
public class AppConfig {

  /**
   * Activate the messages.properties for validation messages
   * 
   * @param messageSource
   * @return
   */
  @Bean
  public LocalValidatorFactoryBean validator(MessageSource messageSource) {
    LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
    validatorFactoryBean.setValidationMessageSource(messageSource);
    return validatorFactoryBean;
  }

  // RestTemplate Bean
  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }
}
