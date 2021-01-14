package foxclub.foxclub.service;

import foxclub.foxclub.model.Drink;
import foxclub.foxclub.model.Food;
import foxclub.foxclub.model.Pet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class PetService {
  private List<Pet> petList = new ArrayList<>();

  public List<Pet> getPetList() {
    return petList;
  }

  public void addPet(Pet pet) {
    petList.add(pet);
  }

  public Pet getPet(String name) {
    return petList.stream().filter(p -> p.getName().equals(name)).findFirst().orElseGet(null);
  }

  public List<String> getDrinkList(){
    return Arrays.stream(Drink.values())
        .map(Enum::toString)
        .collect(Collectors.toList());
  }

  public List<String> getFoodList(){
    return Arrays.stream(Food.values())
        .map(Enum::toString)
        .collect(Collectors.toList());
  }


}
