package org.example.part2;

public class NoneStaticTest {
    public static void main(String[] args) { // call 1
        int a = 10;
        int b = 20;

        NoneStaticTest test = new NoneStaticTest(); // NoneStaticTest객체생성
        int result = test.sum(a,b);
        System.out.println(result);
    }
    public int sum(int a, int b) { // call 2
        int v = a + b;
        return v;
    }
}
