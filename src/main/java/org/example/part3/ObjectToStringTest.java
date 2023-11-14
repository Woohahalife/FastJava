package org.example.part3;

import org.example.part3.model.Board;

public class ObjectToStringTest {
    public static void main(String[] args) {

        Board b = new Board("게시글 title1");

        System.out.println(b.toString());
    }
}
