package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by HashmatN at 1:40 PM on Sep 08, 2021
 */
@Controller
public class MyController {

  private final GreetingService greetingService;

  public MyController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {

    return greetingService.sayGreeting();
  }
}
