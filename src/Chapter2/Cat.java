package Chapter2;

public class Cat {
    {
        System.out.println("Cat's Instance Init Block #1");
    }

    public Cat() {
        System.out.println("Cat's Constructor");
    }

    {
        System.out.println("Cat's Instance Init Block #2");
    }

    public void foo(){
        System.out.println("Cat's Foo");
    }
}
