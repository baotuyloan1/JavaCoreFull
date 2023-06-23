package Chapter3;

public class Car {
  private int weight;
  private static String brand;


  public interface Control{
    void start();
    void stop();
    void brake();
  }

  class Body{
    public void print(){
      System.out.println("Print in body");
    }
  }
  static class Wheel {
    private static int spokes;
    private String name;

    public void rotate() {
      name = "Bao";
      spokes = 1;
      System.out.println("The wheel is rotating...");

      //            weight = 5;
      // Non-static field 'weight' cannot be referenced from a static context

      //            Can access static members của the enclosing class (các static members của cùng
      // class)
      brand = "Honda";
    }

    public void test(Car car) {
      car.weight = 5000;
      System.out.println("car's weight is " + car.weight);
    }

//    a method-local inner class
    void start(){
      class Stater extends Thread{
        public void run(){
          System.out.println("Stating...");
        }
      };


    }


  }
}
