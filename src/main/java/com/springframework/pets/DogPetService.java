package com.springframework.pets;

/**
 * Created by HashmatN at 11:18 AM on Sep 09, 2021
 */
public class DogPetService implements PetService{
  @Override
  public String getPetType(){
    return "Dogs are the best!";
  }
}
