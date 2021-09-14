package guru.springframework.sfgdi.repositories;

/**
 * Created by HashmatN at 4:37 PM on Sep 14, 2021
 */
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
  @Override
  public String getGreeting() {
    return "Hello World - EN";
  }
}
