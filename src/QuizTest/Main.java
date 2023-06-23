package QuizTest;
/**
 * @author BAO 6/23/2023
 */
public class Main {
  public static void main(String[] args) {
    String s1 = "abc";
    StringBuffer s2 = new StringBuffer(s1);

    /**
     * Không bằng nhau vì StringBuffer không phải là String , nên hàm instanceof khi dùng equal của
     * String sẽ trả về false;
     */
    System.out.println(s1.equals(s2));

    /** Bằng vì đã chuyển StringBuilder thành String instanceof true */
    System.out.println(s1.equals(s2.toString()));

    String str = "HI";
    /** Value là hàm chuyển 1 type sang string object Valueof là 1 hàm static */
    System.out.println(String.valueOf("zczxczxc"));
    System.out.println(str.valueOf("zczxczxc"));
    int i = 0;
    for (i = 0; i < 10; i++) {
      continue;
    }
    System.out.println(i);

    /**
     * global variable parent đầu tiên-> Constructor của hàm cha sẽ được thứ 2 -> field của hàm con
     * thứ 3 -> constructor của hàm con thứ 4
     *
     * giá trị global variables ở class con sẽ được khởi tạo với giá trị mặc định theo chuẩn java, các global vairable sẽ có giá trị bằng với giá trị gán trước khi nhảy vào constructor của lớp đó
     *
     * Bởi vì parent constructor có gọi foo() function nhưng nó bị overriden bởi subclass, nên lúc này nó sẽ gọi đến function foo() của subclass. nhưng vì global variable của con chưa được chạy, dẫn đếm thăng member chưa được khởi tạo
     */
    SuperClass reference = new SubClass();
    reference.foo();
  }
}
