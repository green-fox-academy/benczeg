package GardenApp;

public abstract class Plant {
    String color = "colorless";
    int waterAmount = 0;
    String plantType;

    public Plant(){}
    public Plant(String color){
        this.color = color;
    }

    public Plant(String color, int waterAmount){
        this.color = color;
        this.waterAmount = waterAmount;
    }
}
