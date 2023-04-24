package Chapter3;

public class Main {
    public static void main(String[] args) {
//        Car.Wheel wheel = new Car.Wheel();
//        wheel.rotate();

        Car car = new Car();
        Car.Wheel wheel = new Car.Wheel();
        wheel.test(car);

        Car.Control controller = new CarControl();
        controller.start();
        controller.stop();

        Car car1 = new Car();
        Car.Body body = car1. new Body();
        body.print();
    }
}
