import java.util.ArrayList;

public class Farm {
   /* it has list of Animals
    it has slots which defines the number of free places for animals
    breed() -> creates a new animal if there's place for it
    slaughter() -> removes the least hungry animal*/

    ArrayList<Animal> farmList = new ArrayList<>();
    int freeSlots;

    public void breed() {
        farmList.add(new Animal());
        this.freeSlots--;
    }

    public void slaughter() {
        int min = 0;
        for (int i = 0; i < farmList.size(); i++) {
            if (min > farmList.get(i).hunger) {
                min = i;
            }
        }
        farmList.remove(min);
        this.freeSlots++;
    }
}
