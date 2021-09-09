package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by HashmatN at 3:50 PM on Sep 08, 2021
 */
class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();

    controller.greetingService = new ConstructorGreetingService();
  }

  @Test
  void getGreeting() {

    System.out.println(controller.getGreeting());
  }
}