package Chapter1;

public class ControlStatements {
  public static void main(String[] args) {
    //       test();
    int y = 20;
    int a = -y;
    System.out.println(a);
    a = --y;

    System.out.println(y);
    System.out.println(a);
  }

  private static void test() {
    int i = 0;
    for (; i < 2; i++) {
      System.out.println("Bao " + i);
    }
  }
}
