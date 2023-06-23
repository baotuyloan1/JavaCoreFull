package Chapter3.Inheritance;

public class Main {

  public static void main(String[] args) {
//    Truck truck = new Truck();
//    truck.hello();

//      constructor is not inherited.
//      Sub sub = new Sub("Hello");

//      The solution to write a constructor for the subclass and call the super's constructor
      Sub sub = new Sub("hello");

      SubclassVehicle vehicle = new SubclassVehicle();
    vehicle.stop();
  }
}
