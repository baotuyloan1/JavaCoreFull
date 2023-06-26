package interview;

/**
 * @author BAO 6/26/2023
 */

/**
 * Why the main() method is public static?
 *
 * <p>-The main() method is static in Java, so JVM can directly invoke it without instantiating the
 * class's object.
 *
 * <p>- Nếu the main() is non-static, then JVM needs to create the instance of the class, và sẽ xuất
 * hiện sự không rõ ràng nếu constructor của lớp đó có tham số - JVM nên gọi constructor nào và
 * truyền các tham số nào
 *
 * <p>JVM can't instantiate a Java class without calling a constructor method. có nghĩa là phải cung
 * cấp 1 constructor thích hợp với các tham số đầu vào của hàm main
 *
 * <p>Can we overload the main() method in Java? Yes, we can overload the main() method. A java
 * class can have any number of main() method. But to run the java class, the class should have a
 * main() method with signature as public static void main(String[] args)
 *
 * <p>Can we declare the main() method as private or protected or with no access modifier? No, the
 * main() method must be public. You can't defind the main() method as private or protected or with
 * no access modifier. This is because to make the main() method accessible to JVM
 *
 * <p>Can we declare the main() method as a non-static? No, the main() method must be declared as
 * static so that JVM can call the main() method without instantiating its class. If you remove
 * 'static' from the main() method signature, the compilation will be successful but the program
 * fails at runtime.
 *
 * <p>Can we change the return type of the main() method? No, the return type of the main() method
 * must be void only. Any other type is not acceptable.
 *
 * <p>Can the main() method take an argument other than String array? No, an argument of the main()
 * method must be a string array. but, from the introduction of var args, you can pass var args of
 * string type as an argument to the main() method
 *
 * <p>Can we run define Java Class without the main() method? No, we cannot fefind a class without
 * the main() method starting from Java 7. In the previous release of java, we can have static
 * initializers as an alternative:
 *
 * <p>Can we make the main final in Java?
 * Yes, you canb make the main() method final
 *
 */
public class JavaMainMethod {

  public JavaMainMethod(int arg0) {}

  public JavaMainMethod(int arg0, int arg1) {}

  public JavaMainMethod(String arg1[]) {}

  public void main1(String... args) {
    /** non static method */
  }
  /**
   * The main() method is public in Java because it has to be invoked by JVM. So, if main() is not
   * public in Java, the JVM won't call it
   */
  public static final void main(String... args1) {
    System.out.println("Hello world !" + args1);
  }

  public static void main(int args) {
    System.out.println("Another main method");
  }

  public static double main(int i, double d) {
    System.out.println("Another main method2");
    return d;
  }
}
