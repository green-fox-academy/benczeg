package GardenApp;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
        plantType = "flower";
    }

    public Flower(String color, int waterAmount) {
        super(color);
        super.waterAmount = waterAmount;
    }
}
