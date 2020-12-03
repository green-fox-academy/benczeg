public class BattleApp {
    public static void main(String[] args) {
        Ship hajo1 = new Ship();
        Ship hajo2 = new Ship();

        hajo1.fillShip();
        hajo2.fillShip();

        hajo1.battle(hajo2);
    }
}
