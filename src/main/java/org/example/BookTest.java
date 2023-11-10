package org.example;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        // 객체 생성 및 초기화
        Book b = new Book();
        // 멤버 변수에 접근
        b.title = "자바";
        b.price = 15000;
        b.author = "박매일";
        b.publisher = "패스트캠퍼스";
        b.page = 300;
        b.isbn = "1199110";

    }
}

class Book {
    public String title;
    public int price;
    public String author;
    public String publisher;
    public int page;
    public String isbn;
}
