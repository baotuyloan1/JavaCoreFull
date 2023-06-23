package Chapter3.Inheritance;

public class Truck extends Car  implements Moveable{
  public Truck() {
    numberOfWheels = 8;
    numberOfSeats = 2;
    enginePower = 1500;
    length = 20;
    height = 8;
  }

  public void hello(){
    System.out.println("Truck hello");
  }


  @Override
  public void move() {

  }
}
