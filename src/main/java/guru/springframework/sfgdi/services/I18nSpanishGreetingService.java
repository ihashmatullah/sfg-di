package guru.springframework.sfgdi.services;

/**
 * Created by HashmatN at 10:41 AM on Sep 09, 2021
 */
//@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hola Mundo - ES";
  }
}
