package org.example.part4;

import org.example.part4.util.IntArray;

import java.util.Arrays;

public class MyintArrayTest {
    public static void main(String[] args) {
        IntArray list = new IntArray(); // 배열생성
        System.out.printf("현재 배열의 용량 %s%n", list.size());
        System.out.printf("현재 배열의 길이 %s%n", list.length());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(4));
        System.out.printf("현재 배열의 길이 %s%n", list.length());

        list.add(6);
        System.out.printf("현재 배열의 길이 %s%n", list.length());
        System.out.println(list.get(7));


    }
}
