package org.example.part2;

import org.example.part2.model.Person;

public class PersonAccessTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "최건";
        p.age = 1000;
        p.phone = "010-1111-1111";
        System.out.println(p.toString());
    }
}
