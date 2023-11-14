package org.example.part3.model;

public class Dog extends Animal {
    @Override
    public void eat() { // 메서드 오버라이드
        System.out.println(super.getClass().getSimpleName() + " : " + "개처럼 먹다");
    }
}
