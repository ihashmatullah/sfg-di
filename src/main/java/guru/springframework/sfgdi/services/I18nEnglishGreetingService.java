package guru.springframework.sfgdi.services;

/**
 * Created by HashmatN at 10:40 AM on Sep 09, 2021
 */
public class I18nEnglishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
