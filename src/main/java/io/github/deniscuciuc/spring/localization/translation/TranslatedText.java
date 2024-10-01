package io.github.deniscuciuc.spring.localization.translation;

import java.util.Dictionary;

/**
 * Represents a translated text.
 *
 * <p>A translated text is a text that has multiple translations in different languages.
 *
 * <p>Each translation is represented by a pair of a language and the translated text in that
 * language.
 *
 * <p>For example, a translated text can have translations in English and Russian.
 *
 * @see Language
 * @see TranslationsService
 * @see StringResource
 * @see TranslationConfig
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public class TranslatedText {
  private final String key;
  private final Dictionary<Language, String> translations;

  /**
   * Creates a new translated text with the given key and translations.
   *
   * @param key the key of the translated text
   * @param translations the translations of the text
   */
  public TranslatedText(String key, Dictionary<Language, String> translations) {
    this.key = key;
    this.translations = translations;
  }

  /**
   * Returns the key of the translated text.
   *
   * @return the key of the translated text
   */
  public String getKey() {
    return key;
  }

  /**
   * Returns the translations of the text.
   *
   * @return the translations of the text
   */
  public Dictionary<Language, String> getTranslations() {
    return translations;
  }
}
