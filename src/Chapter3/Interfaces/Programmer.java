package Chapter3.Interfaces;

public class Programmer implements User {
  @Override
  public String getName() {
    return null;
  }

  //    access modifier ở lớp con không được nhỏ hơn lớp cha, vì lớp cha là public (interface) nên
  // lớp con chỉ được public
//    áp dụng đươc cho cả override của class
  @Override
  public void setName(String name) {}

  @Override
  public String getEmail() {
    return null;
  }

  @Override
  public void setEmail(String email) {}
}
