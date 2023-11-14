package org.example.part3;

import org.example.part3.model.Radio;
import org.example.part3.model.RemoteControl;
import org.example.part3.model.Tv;

public class InterfaceTest {
    public static void main(String[] args) {
        // 인터페이스는 다형성 100%보장
        System.out.println("------ Radio ------");
        RemoteControl c1 = new Radio();
        c1.chUp();
        c1.chDown();
        c1.volUp();
        c1.volDown();
        c1.internet();

        System.out.println("------ TV -------");
        RemoteControl c2 = new Tv();
        c2.chUp();
        c2.chDown();
        c2.volUp();
        c2.volDown();
        c2.internet();
    }
}
