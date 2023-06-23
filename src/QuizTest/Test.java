package QuizTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author BAO 6/23/2023
 */
class Base {
  public void test() {}
}

class Base1 extends Base {
  public void test() {
    System.out.println("Base1");
  }
}

class Base2 extends Base {
  public void test() {
    System.out.println("Base2");
  }
}

class Test {
  public static void main(String[] args) {
    Base obj = new Base1();
    ((Base2) obj).test(); // CAST

    List list = new ArrayList();
    ((LinkedList) list).add(null);

    String a = "2312";
  }
}
