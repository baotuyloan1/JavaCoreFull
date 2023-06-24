package String;
/**
 * @author BAO 6/24/2023
 */
public class PerformanceTestString {
  public static void main(String[] args) {
    String str = "";
    long startTime = System.nanoTime();
    for (int i = 0; i < 10; i++) {
      str = str + i;
    }

    long endTime = System.nanoTime();
    System.out.println(
        String.format(
            "String operation with operator took [%d] nano seconds", (endTime - startTime)));

    StringBuffer stringBuffer = new StringBuffer();
    startTime = System.nanoTime();
    for (int i = 0; i < 10; i++) {
      stringBuffer.append(i);
    }
    endTime = System.nanoTime();
    System.out.println(
        String.format(
            "String operation with StringBuffer took [%d] nano seconds", (endTime - startTime)));

    StringBuilder stringBuilder = new StringBuilder();
    startTime = System.nanoTime();
    for (int i = 0; i < 10; i++) {
      stringBuilder.append(i);
    }
    endTime = System.nanoTime();
    System.out.println(
        String.format(
            "String operation with StringBuilder took [%d] nano seconds", (endTime - startTime)));


  }
}
