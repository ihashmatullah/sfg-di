package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by HashmatN at 10:14 AM on Sep 09, 2021
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hello World -- Property";
  }
}
