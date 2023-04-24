package Chapter2;

public class Dog {
    // begin instance initialization block
    {
        System.out.println("Dog's Instace Init Block");
    }
    // end instance initialization block

    public Dog() {
        super();
        System.out.println("Dog's consstructor");
    }
}
