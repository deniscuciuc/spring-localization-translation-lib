package io.github.deniscuciuc.spring.localization.translation;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

/**
 * Implementation for {@link TranslationsService}.
 *
 * @see TranslationsService
 * @author Denis Cuciuc
 * @since 0.0.1
 */
@Service
public class TranslationsServiceImpl implements TranslationsService {

  private final MessageSource messageSource;

  public TranslationsServiceImpl(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  @Override
  public TranslatedText getTranslatedText(StringResource resource) {
    return null;
  }

  @Override
  public String getTranslatedValue(StringResource resource, Language language) {
    return "";
  }
}
