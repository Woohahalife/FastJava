package org.example.part2;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = MyUtil.sum1(a,b); // static메서드인 sum이 클래스 사용 시점에
        //자동으로 static-zone에 올라가있기 때문에 객체를 생성할 필요가 없다.

        System.out.println(result);
    }
}
