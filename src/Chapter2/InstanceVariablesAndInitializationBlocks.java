package Chapter2;

public class InstanceVariablesAndInitializationBlocks {

    int number; //number will have default value :0
    float ratio; //default value : 0.0
    boolean success; //default value: false

    String name; //default: null
    Object obj; //default:null
    String[] names;

    public void print() {

        System.out.println("number = " + number);
        System.out.println("ratio = " + ratio);
        System.out.println("success = " + success);
        System.out.println("name = " + name);
        System.out.println("obj = " + obj);
        System.out.println("names=" + names);
        boolean[] booleans = new boolean[4];
        for (boolean b : booleans) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {

//        new InstanceVariablesAndInitializationBlocks().print();

//        Dog dog = new Dog();

//        Cat cat = new Cat();

//        Parent parent = new Parent();

        Bird bird = new Bird();
        Bird bird1 = new Bird();
    }





}
