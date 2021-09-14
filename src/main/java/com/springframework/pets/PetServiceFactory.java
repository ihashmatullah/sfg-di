package com.springframework.pets;

/**
 * Created by HashmatN at 4:48 PM on Sep 14, 2021
 */
public class PetServiceFactory {

  public PetService getPetService(String petType) {
    switch (petType) {
      case "dog":
        return new DogPetService();
      case "cat":
        return new CatPetService();
      default:
        return new DogPetService();
    }
  }
}
