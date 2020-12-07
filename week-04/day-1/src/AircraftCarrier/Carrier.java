package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircraft> carrier = new ArrayList<>();
    int ammoStored;
    int hp;

    public Carrier(int ammoStored) {
        this.ammoStored = ammoStored;
        hp = 5000;
    }

    public void add(Aircraft aircraft) {
        carrier.add(aircraft);
    }

    public void fill() {
        for (Aircraft plane : carrier) {
            if (plane.isPriority()) {
                plane.refill(ammoStored);
            }
        }
        for (Aircraft plane : carrier) {
            plane.refill(ammoStored);
        }
    }

    public void fight(Carrier otherCarrier) {
        int damage = 0;
        for (Aircraft plane : this.carrier) {
            damage += plane.fight();
        }
        otherCarrier.hp = otherCarrier.hp - damage;
    }

    public void getStatus() {
        if (this.hp <= 0) {
            System.out.println("It's dead, Jim :(");
        } else {
            int totalDamage = 0;
            for (Aircraft plane : carrier) {
                totalDamage += plane.ammunition * plane.baseDamage;
            }
            System.out.println("HP: " + this.hp + ", Aircraft count: " + carrier.size() + " , Ammo Storage: " + this.ammoStored + ", Total damage: " + totalDamage);
            System.out.println("Aircrafts:");
            for (Aircraft plane : carrier) {
                System.out.println(plane.getStatus());
            }
        }
    }
}
