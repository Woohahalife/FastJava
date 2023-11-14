package org.example.part3.model;

public class Board {

    private String title;

    public Board(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        System.out.println(super.toString()); // 부모클래스의 toString()을 바로 사용
        return String.format("title : %s", this.title);
    }
}
