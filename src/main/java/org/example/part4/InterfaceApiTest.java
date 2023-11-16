package org.example.part4;

import org.example.part4.model.InterfaceA;
import org.example.part4.model.InterfaceAImpl;

public class InterfaceApiTest {
    public static void main(String[] args) {
        InterfaceA a = new InterfaceAImpl(); // 인터페이스 선언 및 구현객체 생성
        a.X(); // 구현체의 메서드가 동작(동적바인딩)
        a.Y();
        a.Z();
    }
}
