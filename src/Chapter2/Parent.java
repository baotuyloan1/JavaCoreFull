package Chapter2;

public class Parent  extends  People{
    {
        System.out.println("Instance initialization block in Parent");
    }

    Parent() {
        super("AAA");
        System.out.println("Constructor in Parent");
    }
}
