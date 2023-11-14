package org.example.part3;

import org.example.part3.model.Animal;
import org.example.part3.model.Cat;
import org.example.part3.model.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // upcasting
        Animal animal2 = new Cat();
        animal1.eat(); // 동물처럼먹다 -> 개처럼먹다 (오버라이드됨) : 실행시점에 실행 메서드 결정
        animal2.eat();
    }
}
