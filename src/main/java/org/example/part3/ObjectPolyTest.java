package org.example.part3;

import org.example.part3.model.Aclass;
import org.example.part3.model.Bclass;

public class ObjectPolyTest {
    public static void main(String[] args) {
        Aclass a = new Aclass();
        display(a);
        Bclass b = new Bclass();
        display(b);
    }

    // 다형성 인수 활용
    private static void display(Object obj) {
        if (obj instanceof Aclass) {
            ((Aclass) obj).display();
        } else {
            ((Bclass) obj).display();
        }
    }
}
