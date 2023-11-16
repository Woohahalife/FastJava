package org.example.part4;

public class WrapperTest {
    public static void main(String[] args) {

        int i = 10; // 기본 자료형
        //Integer a = new Integer(10); // 사용자정의 자료형(Obj) - boxing

        Integer a = 10; // auto-boxing
        //int b = a.intValue(); // Unboxing(Integer -> int)

        int b = a; // Auto-unboxing

    }
}
