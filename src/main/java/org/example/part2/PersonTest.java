package org.example.part2;

import org.example.part2.model.Person;

public class PersonTest {
    public static void main(String[] args) {
        //Person 객체를 저장할 변수 선언
        Person p;
        // Person 객체를 메모리에 생성
        p = new Person(); // 객체 생성 및 변수에 할당(객체의 실체화)

        //멤버 변수에 접근
        p.name = "김이박";
        p.age = 30;
        p.phone = "010-4242-1075";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);

        // 멤버 메서드에 접근
        p.play();
        p.eat();
        p.walk();
    }
}
