package foxclub.foxclub.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

  private String name;
  private List<Trick> tricks = new ArrayList<>();
  private Food food;
  private Drink drink;

  public Pet(String name) {
    this.name = name;
    tricks.add(Trick.Go);
    food = Food.Mackerel;
    drink = Drink.sake;
  }

  public String getName() {
    return name;
  }

  public Integer getTricksNum() {
    return tricks.size();
  }

}
