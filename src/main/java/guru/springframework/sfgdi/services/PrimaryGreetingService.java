package guru.springframework.sfgdi.services;

/**
 * Created by HashmatN at 10:27 AM on Sep 09, 2021
 */
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - From the PRIMARY Bean";
  }
}
