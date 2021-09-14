package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by HashmatN at 10:40 AM on Sep 09, 2021
 */
public class I18nEnglishGreetingService implements GreetingService {

  private final EnglishGreetingRepository englishGreetingRepository;

  public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
    this.englishGreetingRepository = englishGreetingRepository;
  }

  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
