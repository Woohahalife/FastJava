package org.example.part3;

import org.example.part3.model.Aclass;

public class ObjectTest {
    public static void main(String[] args) {
        Aclass a = new Aclass(); // 일반적인 객체생성
        Object obj = new Aclass(); // UpCasting

        //obj.display(); // 에러, Upcasting 상태에서는 직접적으로 자식클래스에 접근 불가
        ((Aclass)obj).display(); // OK, DownCasting을 이용해 자식클래스에 접근 가능
    }
}
