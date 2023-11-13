package org.example.part2;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        MyUtil util = new MyUtil(); // MyUtil 객체 생성

        int result = util.sum2(a,b);

        System.out.println(result);
    }
}
