public class GasStation {
    public static void main(String[] args) {
        Station station = new Station();
        Car car = new Car();
        System.out.println(car.gasAmount);
        station.refill(car);
        System.out.println(car.gasAmount);
        System.out.println("station: " + station.gasAmount);
    }
}
