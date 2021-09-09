package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by HashmatN at 10:41 AM on Sep 09, 2021
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hola Mundo - ES";
  }
}
