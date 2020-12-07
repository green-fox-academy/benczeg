package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();

    public void add(Tree tree) {
        plants.add(tree);
    }

    public void add(Flower flower) {
        plants.add(flower);
    }

    public void watering(int water) {
        System.out.println("Watering with " + water);
        for (Plant plant : plants) {
            if (plant.plantType.equals("tree") && plant.waterAmount < 10) {
                plant.waterAmount += (water * 4 / 10);
            }
            if (plant.plantType.equals("flower") && plant.waterAmount < 5) {
                plant.waterAmount += (water * 3 / 4);
            }
        }
    }

    public void status() {
        for (Plant plant : plants) {
            if (plant.plantType.equals("tree") && plant.waterAmount < 10) {
                System.out.println("The " + plant.color + " " + plant.plantType + " needs water");
            } else if (plant.plantType.equals("tree") && plant.waterAmount >= 10) {
                System.out.println("The " + plant.color + " " + plant.plantType + " doesnt need water");
            }
            if (plant.plantType.equals("flower") && plant.waterAmount < 5) {
                System.out.println("The " + plant.color + " " + plant.plantType + " needs water");
            } else if (plant.plantType.equals("flower") && plant.waterAmount >= 5) {
                System.out.println("The " + plant.color + " " + plant.plantType + " doesnt need water");
            }
        }
    }
}
