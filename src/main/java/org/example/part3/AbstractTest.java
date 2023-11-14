package org.example.part3;

import org.example.part3.model.Animal;
import org.example.part3.model.Cat;
import org.example.part3.model.Dog;

public class AbstractTest {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.eat();
        animal2.eat();
        System.out.println("++++ 구현메서드 사용 ++++");
        animal1.move();
        animal2.move();

    }


}
