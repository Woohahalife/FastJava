package org.example.part3.model;

public abstract class Animal { // 추상 클래스

    public abstract void eat(); // 추상 메서드(메서드 구현부 x -> 자식클래스에서 메서드 반드시 재정의해야함)

    public void move() { // 일반 메서드도 구현가능
        System.out.println("무리지어 이동한다.");
    }
}
