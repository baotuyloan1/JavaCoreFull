package Chapter3.Interfaces;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Program {

  //    truu tuong hoa va ke thua
  //    private UserDAO userDAO = new UserDAOImpl();
  //  tăng tính linh hoạt cho chương trình
  private static UserDAO userDAO = new AnotherUserDAOImpl();

  public static void main(String[] args) {
    User newUser = new DefaultUser();
    newUser.setName("Bao");
    newUser.setEmail("nguyenducbaokey@gmail.com");

    User coder = new Programmer();
    coder.setName("Bao coder");
    coder.setEmail("coder@gmail.com");

    //    đa hình
    userDAO.create(newUser);
    userDAO.create(coder);
//    PreparedStatement
  }
}
