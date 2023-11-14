package org.example.part3;

import org.example.part3.model.Animal;
import org.example.part3.model.Cat;
import org.example.part3.model.Dog;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        //Dog, Cat을 저장할 배열을 생성(다형성 활용)
        Animal[] animals = {new Dog(), new Cat()}; // 다형성에 의해 배열 내부에서 Animal타입으로 참조되어 처리한다.

        for(Animal animal : animals) {
            animal.eat(); // 오버라이드된 자식 타입의 메서드가 출력됨
            if(animal instanceof Cat) {
                System.out.println(animal.getClass().getSimpleName() + "타입입니다.");
                ((Cat) animal).night(); // Cat타입인 경우 night()메서드 실행
            }
        }
    }
}
