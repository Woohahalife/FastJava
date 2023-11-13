package org.example.part2;

public class StaticTest {
    public static void main(String[] args) { // call 1
        int a = 10;
        int b = 20;
        int result = StaticTest.sum(a,b);
        System.out.println("sum : " + result);
    }
    public static int sum(int a, int b) { // call 2
        int v = a + b;
        return v;
    }
}
