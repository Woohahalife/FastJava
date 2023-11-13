package org.example.part2;

public class AllStatic {

    private AllStatic() {}// 생성자의 접근 제어자를 private로 설정해 객체 생성을 막을 수 있음

    public static int sum(int a, int b) {
        int v = a + b;
        return v;
    }

    public static int max(int a, int b) {
        //return a > b ? a : b;
        return Math.max(a, b);
    }

    public static int min(int a, int b) {
        //return a < b ? a : b;
        return Math.min(a, b);
    }
}
