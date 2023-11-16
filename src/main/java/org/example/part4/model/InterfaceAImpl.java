package org.example.part4.model;

// interfaceA의 구현체인 InterfaceAImpl은 노출시키지 않는다.(간접적으로 상호작용)
public class InterfaceAImpl implements InterfaceA {
    @Override
    public void X() {
        System.out.println("X 동작이 실행된다.");
    }

    @Override
    public void Y() {
        System.out.println("Y 동작이 실행된다.");
    }

    @Override
    public void Z() {
        System.out.println("Z 동작이 실행된다.");
    }
}
