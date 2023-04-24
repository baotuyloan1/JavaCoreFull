package Chapter3;

public class CarControl implements Car.Control {
  @Override
  public void start() {
    System.out.println("Start");
  }

  @Override
  public void stop() {
    System.out.println("stop");
  }

  @Override
  public void brake() {
    System.out.println("brake");
  }
}
