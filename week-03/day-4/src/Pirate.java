import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Pirate {
    int drunkness = 0;
    String status = "alive";
    String statusChangerDie = "he's dead";
    String statusChangerPassedOut = "he's passed out";

    public void drinkSomeRum() {
        if (!status.equals(statusChangerPassedOut) && !status.equals(statusChangerDie)) {
            Random random = new Random();
            drunkness += random.nextInt(4);
        } else {
            System.out.println(status);
        }
    }

    public void howsItGoingMate() {
        if (drunkness <= 4) {
            System.out.println("Pour me anudder!");
            drinkSomeRum();
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            status = statusChangerPassedOut;
        }
    }

    public void die() {
        status = statusChangerDie;
    }

    public void brawl(Pirate pirateToFight) {
        if (pirateToFight.status.equals("alive")) {
            Random random = new Random();
            int rdm = random.nextInt() * 3;
            if (rdm == 0) {
                this.die();
            } else if (rdm == 1) {
                pirateToFight.die();
            } else {
                this.status = statusChangerPassedOut;
                pirateToFight.status = statusChangerPassedOut;
            }
        } else {
            System.out.println(pirateToFight + " " + pirateToFight.status);
        }
    }


}
