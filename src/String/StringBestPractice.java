package String;
/**
 * @author BAO 6/24/2023
 */
public class StringBestPractice {

  /**
   * Strings are used in java classloader and immutability provides security that correct class is
   * getting loaded by Classloader
   *
   * <p>Since String is immutable, its hashcode is cached at the time of creation and it doesn't
   * need to be calculated again. This makes it a great candidate for a key in a Map and it's
   * processing is fast than other HashMap key objects. This is why String is mostly used Object as
   * HashMap keys
   */
  public static void main(String[] args) {
    char c[] = {'J', 'a', 'v', 'a'};
    String s1 = new String(c);
    String s2 = new String(c, 2, 2);

    System.out.println(s1);
    System.out.println(s2);

    /**
     * We can construct a String from a StringBuffer and StringBuilder using String constructors.
     */
    String string = new String(new StringBuffer("Hello Java Buffer"));
    String string2 = new String(new StringBuilder("Hello Java Builder"));

    /**
     * Use String.valueOf() Instead of toString() If object needs to be converted to string then the
     * result of obj.toString() and String.valueOf(obj) will be same but String.valueOf() is null
     * safe, means it will never throw NullPointerException.
     *
     * <p>means if we are sure the object will never be null then we should always use toString()
     * otherwise, String.valueOf() is preferable.
     */
    String test = null;
    //    Below statement will not throw NPE
    System.out.println("String.valueOf:" + String.valueOf(test));

    //    Next statement will throw NPE
    //    System.out.println(test.toString());

    /** equalsIgnoreCase() is faster than using toUpperCase().equals() or toLowerCase().equals(). */

    /** Avoid concatenating characters as strings in StringBuffer/StringBuilder.append methods. */
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(
        "a"); // tránh dùng cách này khi thêm các characters vì nó chiếm từ 2 byte đến 4 byte
    stringBuffer.append('a'); // mỗi ký tự chỉ sử dụng 2 byte
    /**
     * Các phương thức append() của StringBuffer/StringBuilder nên được gọp chung lại với nhau. Điều
     * này cải thiện hiệu suất bằng cách tạo ra bytecode nhỏ hơn.
     */
    StringBuilder helloBao = new StringBuilder();
    helloBao.append("Hello").append(" Nguyen").append(" Duc").append(" Bao");
    System.out.println(helloBao);

    String str = "bao";
    str = str.concat(" nguyen");
    System.out.println(str);
  }

  /** Tránh new 1 đối tượng để chuyển sang string */
  public String conver(int x) {
    //    this wastes an object
    String foo = new Integer(x).toString();

    /** 1 trong 2 cach; */
    String.valueOf(x);
    return Integer.toString(x);
  }

  private class Foo {
    /**
     * Tránh sử dụng StringBuffer hay StringBuilder làm global variable StringBuffers/StringBuilders
     * có thể mở rộng 1 cách đáng kểm và do đó có thể gây ra rò rỉ bộ nhớ nếu được giữ trong các đối
     * tượng long lifetimes.
     */
    private StringBuilder builder;
  }

  private void bar() {
    String howdy = "Howdy";
    buz(howdy);
    buz(howdy);
  }

  private void buz(String x) {}

  // Better
  private static final String HOWDY = "Howdy";

  private void bar1() {
    buz(HOWDY);
    buz(HOWDY);
  }
}
