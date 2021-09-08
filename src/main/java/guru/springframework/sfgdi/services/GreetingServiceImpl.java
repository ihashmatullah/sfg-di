package guru.springframework.sfgdi.services;

/**
 * Created by HashmatN at 3:44 PM on Sep 08, 2021
 */
public class GreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World";
  }
}
