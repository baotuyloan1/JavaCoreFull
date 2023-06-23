package Chapter3.Inheritance;

public class Sub extends Super {
  //      The solution to write a constructor for the subclass and call the super's constructor
  public Sub(String a) {
    super(a);
  }

  public void bar() {
    System.out.println("Sub.bar()...");
  }

  public void test() {
    super.bar();
    this.bar();
  }
}
