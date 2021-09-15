package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by HashmatN at 10:38 AM on Sep 15, 2021
 */
@Component
public class SingletonBean {

  public SingletonBean() {
    System.out.println("Creating a Singleton Bean");
  }
  public String getMyScope(){
    return "I'm a Singleton";
  }
}
