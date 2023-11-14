package org.example.part3.model;

public class Cat extends Animal {
    @Override
    public void eat() { // 메서드 오버라이드
        System.out.println(super.getClass().getSimpleName() + " : " + "고양이처럼 먹다");
    }

    public void night() {
        System.out.println(super.getClass().getSimpleName() + " : " + "밤에 눈이 밝아진다.");
    }
}
