package Chapter3.Inheritance;

public class FireTruck extends Truck {
  public FireTruck() {
    length = 28;
    height = 12;
    enginePower = 2000;
  }
  public void blowWater(){

  }

  public void hello(){
    System.out.println("FireTruck hello");
  }
}
