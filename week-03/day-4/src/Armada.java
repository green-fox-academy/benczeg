import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;

public class Armada {

    ArrayList<Ship> armada = new ArrayList<>();
    int ShipNumber;

    public void fillArmada() {

        Random random = new Random();
        int shipSize = (int) random.nextInt(10) + 1;
        ShipNumber = shipSize;
        for (int i = 0; i < shipSize; i++) {
            Ship newShip = new Ship();
            newShip.fillShip();
            armada.add(newShip);
        }
    }

    public boolean battle(Armada otherArmada) {
        boolean thisArmadaWins = false;
        int i = 0;
        int j = 0;
        System.out.println("");
        System.out.println("First Armada size: " + this.armada.size() + " Second Armada size: " + otherArmada.armada.size());
        while (j != otherArmada.armada.size() && i != armada.size()) {

            if (this.armada.get(i).battle(otherArmada.armada.get(j))) {
                System.out.println("First Armada's " + i + ". ship won the battle.");
                j++;
            } else {
                System.out.println("Second Armada's " + j + ". ship won the battle.");
                i++;
            }
        }
        if (i - 1 != this.armada.size()) {
            thisArmadaWins = true;
            System.out.println("First Armada wins!");
        } else System.out.println("Second Armada wins!");
        return thisArmadaWins;
    }

}
