package Chapter3.Inheritance;

public abstract class Vehicle implements Moveable {
  @Override
  public void start() {
    System.out.println("Not need to override in first non-abstract class");
  }

  @Override
  public void stop() {
    System.out.println("Not need to override in first non-abstract class");
  }
}
