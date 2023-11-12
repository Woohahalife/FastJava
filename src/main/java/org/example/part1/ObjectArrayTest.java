package org.example.part1;

import org.example.part1.Book;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];
        b[0] = new Book();
        b[0].title = "자바";
        b[1] = new Book();
        b[1].title = "스프링";
        System.out.println(b[0].title);
        System.out.println(b[1].title);
    }
}
