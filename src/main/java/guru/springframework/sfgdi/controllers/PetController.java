package guru.springframework.sfgdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.stereotype.Controller;

/**
 * Created by HashmatN at 11:14 AM on Sep 09, 2021
 */
@Controller
public class PetController {

  private final PetService petService;

  public PetController(PetService petService) {
    this.petService = petService;
  }

  public String whichPetIsTheBest(){
    return petService.getPetType();
  }
}
