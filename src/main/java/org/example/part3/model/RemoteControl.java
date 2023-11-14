package org.example.part3.model;

// 인터페이스 : 추상메서드만 가질 수 있음
public interface RemoteControl {

    int MAXCH = 99; // public static final 생략가능
    int MINCH = 1;
    int MAXVOL = 100;
    int MINVOL = 0;

    void chUp(); // public abstract 생략가능
    void chDown();
    void volUp();
    void volDown();
    void internet();
}
