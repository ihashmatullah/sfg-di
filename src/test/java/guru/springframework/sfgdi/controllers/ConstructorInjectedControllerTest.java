package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by HashmatN at 4:38 PM on Sep 08, 2021
 */
class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;
  @BeforeEach
  void setUp() {

    controller = new ConstructorInjectedController(new ConstructorGreetingService());
  }

  @Test
  void getGreeting() {

    System.out.println(controller.getGreeting());

  }
}