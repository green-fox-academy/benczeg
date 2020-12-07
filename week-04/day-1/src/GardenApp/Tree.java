package GardenApp;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
        plantType = "tree";
    }

    public Tree(String color, int waterAmount) {
        super(color);
        super.waterAmount = waterAmount;
    }

    public void status(){
        if (waterAmount < 10){
            System.out.println("The " + color +" "+ plantType + " needs water");
        }
    }

}
