package Chapter3.Polymorphism;

import Chapter2.Fish;

public class Main {
    public static void main(String[] args){
    //        Animal animal = new Bird();
    //        Animal animal = new Dog();
    Animal animal = new Fish();
    Animal animal1 = new Bird();
//        Animal animal1 = new Chapter2.Fish();

        Trainer trainer = new Trainer();
        trainer.teach(animal);
        trainer.teach(animal1);

        animal1.move();

    }
}
