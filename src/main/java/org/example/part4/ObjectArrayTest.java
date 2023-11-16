package org.example.part4;

import org.example.part4.model.Book;
import org.example.part4.model.Person;
import org.example.part4.util.ObjectArray;

public class ObjectArrayTest {
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();
        list.add(new Book("자바의정석",30000,"한빛","남궁성"));
        list.add(new Person("남궁성", 35));
        list.add(new Person("남궁성2", 38));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getAll());
    }
}
