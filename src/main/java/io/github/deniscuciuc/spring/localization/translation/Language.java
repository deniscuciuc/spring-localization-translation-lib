package io.github.deniscuciuc.spring.localization.translation;

import java.util.Locale;

/**
 * Supported languages.
 *
 * <p>The supported languages are:
 *
 * <ul>
 *   <li>English
 *   <li>Russian
 * </ul>
 *
 * @see TranslatedText
 * @see TranslationsService
 * @see StringResource
 * @see TranslationConfig
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public enum Language {

  /**
   * English language.
   *
   * <p>The locale of the language is {@link Locale#ENGLISH}.
   */
  EN(Locale.ENGLISH),

  /**
   * German language.
   *
   * <p>The locale of the language is {@link Locale#GERMAN}.
   */
  DE(Locale.GERMAN),

  /**
   * French language.
   *
   * <p>The locale of the language is {@link Locale#FRENCH}.
   */
  FR(Locale.FRENCH),

  /**
   * Italian language.
   *
   * <p>The locale of the language is {@link Locale#ITALIAN}.
   */
  IT(Locale.ITALIAN),

  /**
   * Russian language.
   *
   * <p>The locale of the language is {@link Locale#of(String, String) Locale.of("ru", "RU")}.
   */
  RU(Locale.of("ru", "RU")),

  /**
   * Romanian language.
   *
   * <p>The locale of the language is {@link Locale#of(String, String) Locale.of("ro", "RO")}.
   */
  RO(Locale.of("ro", "RO")),

  /**
   * Spanish language.
   *
   * <p>The locale of the language is {@link Locale#of(String, String) Locale.of("es", "ES")}.
   */
  ES(Locale.of("es", "ES"));

  private final Locale locale;

  Language(Locale locale) {
    this.locale = locale;
  }

  /**
   * Returns the locale of the language.
   *
   * @return the locale of the language
   */
  public Locale getLocale() {
    return locale;
  }
}
