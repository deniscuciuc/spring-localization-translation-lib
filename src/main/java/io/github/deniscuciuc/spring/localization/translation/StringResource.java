package io.github.deniscuciuc.spring.localization.translation;

import java.util.Arrays;

/**
 * A <code>io.github.deniscuciuc.spring.localization.translation.StringResource</code> is a tuple
 * containing a string resource key and its arguments. A <code>
 * io.github.deniscuciuc.spring.localization.translation.StringResource</code> allows the arguments
 * to a key to be nested. Arguments of type <code>
 * io.github.deniscuciuc.spring.localization.translation.StringResource</code> will be resolved
 * bottom up.
 *
 * @see Language
 * @see TranslatedText
 * @see TranslationsService
 * @see TranslationConfig
 * @author Denis Cuciuc
 * @since 0.0.1
 */
public class StringResource {
  private static final Object[] NO_ARGUMENTS = {};

  /**
   * An empty <code>io.github.deniscuciuc.spring.localization.translation.StringResource</code> with
   * no key and no arguments.
   */
  public static final StringResource EMPTY = new StringResource(NO_ARGUMENTS);

  private final String key;
  private final Object[] arguments;

  /**
   * Creates a <code>io.github.deniscuciuc.spring.localization.translation.StringResource</code>
   * with the given key and no arguments.
   *
   * @param key the key of the string resource
   */
  public StringResource(String key) {
    this(key, NO_ARGUMENTS);
  }

  /**
   * Creates a <code>io.github.deniscuciuc.spring.localization.translation.StringResource</code>
   * with the given key and arguments.
   *
   * @param key the key of the string resource
   * @param arguments the arguments of the string resource
   */
  public StringResource(String key, Object... arguments) {
    this.key = key;
    this.arguments = arguments;
  }

  /**
   * Creates a <code>io.github.deniscuciuc.spring.localization.translation.StringResource</code>
   * with the given arguments.
   *
   * @param arguments the arguments of the string resource
   */
  public StringResource(Object... arguments) {
    this.key = null;
    this.arguments = arguments;
  }

  /**
   * Returns the key of the string resource.
   *
   * @return the key of the string resource
   */
  public String getKey() {
    return key;
  }

  /**
   * Returns the arguments of the string resource.
   *
   * @return the arguments of the string resource
   */
  public Object[] getArguments() {
    return arguments;
  }

  /**
   * Returns a string representation of the <code>
   * io.github.deniscuciuc.spring.localization.translation.StringResource</code>.
   *
   * @return a string representation of the <code>
   *     io.github.deniscuciuc.spring.localization.translation.StringResource</code>
   */
  @Override
  public String toString() {
    return key + ":" + Arrays.toString(arguments);
  }
}
