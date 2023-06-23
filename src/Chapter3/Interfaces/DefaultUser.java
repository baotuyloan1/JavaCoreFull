package Chapter3.Interfaces;

public class DefaultUser implements User,Comparable, User1{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
