package Chapter3.Interfaces;

public interface Color {

  //    public static final bắt buộc;
  public static final int RED = 0xff0000;

  //   methods in an interface are public implicitly(ngầm định)
  public void draw();

  //   Nếu nó là static bắc buộc phải implement code vì static có trước khi object được tạo ra.
  //    java mặc định nó sẽ tạo ra các cai gì có static luôn, thứ 2 là static nếu mỗi lớp con
  // implement code thì sẽ dẫn đến return không chính xác vì nó dùng chung :D
  static void code1() {
    System.out.println("static method");
  }

  default void void2(){

  };
}
