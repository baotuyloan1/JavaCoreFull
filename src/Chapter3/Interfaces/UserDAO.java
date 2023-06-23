package Chapter3.Interfaces;

import java.util.Collection;

public interface UserDAO {
    void create(User user);
    void delete (User user);
    Collection<User> list();
    User get(String name);

}
