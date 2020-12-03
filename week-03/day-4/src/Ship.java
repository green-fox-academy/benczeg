import java.util.ArrayList;
import java.util.Random;

public class Ship {

    ArrayList<Pirate> crew = new ArrayList<>();
    Pirate captain = new Pirate();
    String statusToCheck = "alive";
    int alives;
    int sizeOfCrew;

    public void fillShip() {

        Random random = new Random();
        int crewSize = (int) random.nextInt(100) + 1;
        sizeOfCrew = crewSize;
        for (int i = 0; i < crewSize; i++) {
            Pirate pirate = new Pirate();
            crew.add(pirate);
        }
    }

    public void shipStatus() {
        System.out.println("Captain: " + captain.status);
        System.out.println("Captain's drunkness: " + captain.drunkness);
        int aliveCrewMembers = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            if (this.crew.get(i).status.equals(statusToCheck)) {
                aliveCrewMembers++;
            }
        }
        alives = aliveCrewMembers;
        if (alives == 0) {
            captain.status = captain.statusChangerDie;
        }
        System.out.println("Ship's crew: " + aliveCrewMembers);
    }

    public boolean battle(Ship otherShip) {
        System.out.println("");
        System.out.println("Before battle ship attacker: ");
        shipStatus();
        System.out.println("Before battle ship attacked: ");
        otherShip.shipStatus();
        boolean thisShipWins = false;
        int rounds;
        rounds = (Math.min(this.sizeOfCrew, otherShip.sizeOfCrew));
        for (int i = 0; i < rounds; i++) {
            this.crew.get(i).brawl(otherShip.crew.get(i));
        }
        int scoreThisShip = (this.alives - this.captain.drunkness);
        int scoreOtherShip = (otherShip.alives - otherShip.captain.drunkness);
        if (scoreThisShip > scoreOtherShip) {
            thisShipWins = true;
        }
        System.out.println("After battle ship attacker: ");
        shipStatus();
        System.out.println("After battle ship attacked: ");
        otherShip.shipStatus();
        if (thisShipWins) {
            System.out.println("First ship wins.");
            this.celebrate();
            otherShip.losses();
        } else {
            System.out.println("Second ship wins.");
            this.losses();
            otherShip.celebrate();
        }
        System.out.println("After celebration ship attacker: ");
        shipStatus();
        System.out.println("After celebration ship attacked: ");
        otherShip.shipStatus();

        return thisShipWins;
    }

    public void celebrate() {
        Random random = new Random();
        for (int i = 0; i < sizeOfCrew; i++) {
            int rand = random.nextInt(2);
            if (rand == 0) {
                crew.get(i).howsItGoingMate();
            }
            captain.howsItGoingMate();
        }
    }

    public void losses() {
        Random random = new Random();
        for (int i = 0; i < sizeOfCrew; i++) {
            int rand = random.nextInt() * 2;
            crew.get(i).status = (rand == 0 ? "he's dead" : crew.get(i).status);

        }
    }
}
