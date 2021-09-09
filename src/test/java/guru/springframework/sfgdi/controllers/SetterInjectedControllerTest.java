package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by HashmatN at 4:22 PM on Sep 08, 2021
 */
class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}