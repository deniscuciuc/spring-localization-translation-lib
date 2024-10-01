package io.github.deniscuciuc.spring.localization.translation;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Configuration class for the translation package. This class is used to enable component scanning
 * for the translation package and to create a {@link MessageSource} bean.
 *
 * @see Language
 * @see TranslationsService
 * @see TranslatedText
 * @see StringResource
 * @author Denis Cuciuc
 * @since 0.0.1
 */
@Configuration
@ComponentScan("io.github.deniscuciuc.spring.localization.translation")
public class TranslationConfig {

  /**
   * Creates a {@link MessageSource} bean that is used to resolve messages from the localization
   * files.
   *
   * @return a {@link MessageSource} bean
   */
  @Bean
  MessageSource messageSource() {
    ReloadableResourceBundleMessageSource messageSource =
        new ReloadableResourceBundleMessageSource();
    messageSource.setBasename("classpath:localization/texts");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }
}
