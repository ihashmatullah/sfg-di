package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by HashmatN at 1:40 PM on Sep 08, 2021
 */
@Controller
public class MyController {

  public String sayHello() {
    System.out.println("Hello World!!!");

    return "Hi Folks!";
  }
}
