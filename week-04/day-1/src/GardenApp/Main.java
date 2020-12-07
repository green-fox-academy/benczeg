package GardenApp;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.add(new Flower("yellow"));
        garden.add(new Flower("blue"));
        garden.add(new Tree("purple"));
        garden.add(new Tree("orange"));
        garden.status();
        garden.watering(40);
        garden.status();
        garden.watering(70);
        garden.status();
    }
}
