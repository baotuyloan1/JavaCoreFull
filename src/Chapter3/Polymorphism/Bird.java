package Chapter3.Polymorphism;


import Chapter2.Dog;

public class Bird extends Animal {
    public void move() {
        System.out.print("Flying...");
    }


//    Không thể tạo 1 phương thức giống final method ở lớp cha
//    public void sleep(){
//    System.out.println("Dlog sleepping");
//    }

}

