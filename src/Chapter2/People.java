package Chapter2;

public class People {
    {
        System.out.println("Instance initialization block in People");
    }

//    People() {
//        System.out.println("Constructor in People");
//    }

    People(String a){
        System.out.println(a);
    }
}
