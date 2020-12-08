package AircraftCarrier;

public class Main {
  public static void main(String[] args) {
    Carrier carrier = new Carrier(2300);
    Carrier carrier2 = new Carrier(0);
    carrier.add(new F35());
    carrier.add(new F35());
    carrier.add(new F35());
    carrier.add(new F16());
    carrier.add(new F16());
    carrier.fill();
    carrier.getStatus();
    carrier.fight(carrier2);
    carrier.fill();
    carrier.fight(carrier2);
    carrier.fill();
    carrier.fight(carrier2);
    carrier.fill();
    carrier2.getStatus();
  }
}
