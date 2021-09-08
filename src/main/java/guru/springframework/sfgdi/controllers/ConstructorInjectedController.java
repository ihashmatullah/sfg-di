package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by HashmatN at 4:28 PM on Sep 08, 2021
 */
@Controller
public class ConstructorInjectedController {
  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
