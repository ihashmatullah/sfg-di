package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by HashmatN at 10:20 AM on Sep 09, 2021
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hello World -- Setter";
  }
}
