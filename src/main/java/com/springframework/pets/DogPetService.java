package com.springframework.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by HashmatN at 11:18 AM on Sep 09, 2021
 */
@Profile({"dog", "default"})
@Service("dog")
public class DogPetService implements PetService{
  @Override
  public String getPetType(){
    return "Dogs are the best!";
  }
}
