package com.springframework.pets;

import org.springframework.stereotype.Service;

/**
 * Created by HashmatN at 11:17 AM on Sep 09, 2021
 */
@Service("cat")
public class CatPetService implements PetService {
  @Override
  public String getPetType() {
    return "Cats Are the Best!";
  }
}
