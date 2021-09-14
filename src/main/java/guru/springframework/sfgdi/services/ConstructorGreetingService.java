package guru.springframework.sfgdi.services;

/**
 * Created by HashmatN at 3:44 PM on Sep 08, 2021
 */
public class ConstructorGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World -- Constructor";
  }
}
