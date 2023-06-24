package String;
/**
 * @author BAO 6/24/2023
 */

/**
 * That means using switch we can improve the performance, from the above result it is clear that
 * comparison with if-else takes double time than the time taken by the switch. This example has
 * only 4 comparisons, if there are more than 4 if-else then switch will give a better result than
 * if-else.
 */
public class SwitchString {

  private static int converStringToIntegerWithSwitch(String stringNumber) {
    switch (stringNumber) {
      case "ZERO":
        return 0;
      case "ONE":
        return 1;
      case "TWO":
        return 2;
      case "THREE":
        return 3;
      default:
        return -1;
    }
  }

  private static int convertStringToIntegerWithIf(String stringNumber) {
    if ("ZERO".equals(stringNumber)) {
      return 0;
    } else if ("ONE".equals(stringNumber)) {
      return 1;
    } else if ("TWO".equals(stringNumber)) {
      return 2;
    } else if ("THREE".equals(stringNumber)) {
      return 3;
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    converStringToIntegerWithSwitch("FOUR");
    long endTime = System.nanoTime();
    System.out.println(
        String.format(
            "String comparison with Switch took [%d] nano seconds.", (endTime - startTime)));

    startTime = System.nanoTime();
    convertStringToIntegerWithIf("FOUR");
    endTime = System.nanoTime();
    System.out.println(
        String.format("String comparison with If took [%d] nano seconds.", (endTime - startTime)));
  }
}
