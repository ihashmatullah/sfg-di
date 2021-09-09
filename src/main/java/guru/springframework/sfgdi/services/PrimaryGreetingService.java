package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by HashmatN at 10:27 AM on Sep 09, 2021
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - From the PRIMARY Bean";
  }
}
