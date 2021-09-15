package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by HashmatN at 10:39 AM on Sep 15, 2021
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
  public PrototypeBean() {
    System.out.println("Creating a Prototype Bean!!!!!!!!!!!!!!!!!!!");
  }
  public String getMyScope(){
    return "I'm a Prototype";
  }
}
