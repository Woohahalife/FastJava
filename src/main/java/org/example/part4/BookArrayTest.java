package org.example.part4;

import org.example.part4.model.Book;
import org.example.part4.util.BookArray;

import java.util.ArrayList;
import java.util.Arrays;

public class BookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        System.out.println(list.size());

        ArrayList list2 = new ArrayList();

        list.add(new Book("자바의정석",30000,"한빛","남궁성"));
        list.add(new Book("C++",40000,"한빛","author2"));
        list.add(new Book("데미안",14000,"대림","author3"));
        list.add(new Book("연금술사",23000,"웅진","author4"));
        list.add(new Book("어린왕자",11000,"한빛","author5"));

        System.out.println(list.get(0));
        System.out.println(list.get(0).getAuthor());
        System.out.println(list.getAll());

        System.out.println(list.size());

        list.add(new Book("어린공주",16000,"한빛","author6"));
        System.out.println(list.getAll());

        System.out.println(list.size());
    }
}
