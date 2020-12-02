public class Station {
    int gasAmount = 1000000;


    public void refill(Car car) {
        this.gasAmount = this.gasAmount - (car.Capacity - car.gasAmount);
        car.gasAmount = car.Capacity;
    }
}
