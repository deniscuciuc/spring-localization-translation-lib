package io.github.deniscuciuc.spring.localization.translation;

/**
 * Service for translations.
 *
 * <p>Provides methods for getting translated text and values.
 *
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public interface TranslationsService {

  /**
   * Returns the translated text for the given resource.
   *
   * @param resource the resource of the translated text
   * @return the translated text
   */
  TranslatedText getTranslatedText(StringResource resource);

  /**
   * Returns the translated value for the given resource and language.
   *
   * @param resource the resource of the translated value
   * @param language the language of the translated value
   * @return the translated value
   */
  String getTranslatedValue(StringResource resource, Language language);
}
