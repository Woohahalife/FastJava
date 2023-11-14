package org.example.part3;

import org.example.part3.model.Animal;
import org.example.part3.model.Cat;
import org.example.part3.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    public static void display(Animal animal) { // 다형성 인수
        animal.eat();
        if(animal instanceof Cat) {
            System.out.println("매개변수로 " +
                    animal.getClass().getSimpleName() + "을 받음");
            ((Cat)animal).night(); // 매개변수로 받은 객체가 Cat인 경우 night()실행
        }
    }
}
