package org.example.part4;

public class HelloWorldTest {
    public static void main(String[] args) {
        String str1 = new String("HelloWorld"); // 문자열 객체 생성 - Heap Memory
        System.out.println(str1);
        String str2 = new String("HelloWorld"); // 문자열 객체 생성 - Heap Memory
        System.out.println(str1);

        if(str1 == str2) {
            System.out.println(true);
        }else {
            System.out.println(false); // 주소값이 다르기 때문에 같지않음
        }

        if(str1.equals(str2)) {
            System.out.println(true); // equals()메서드로 객체내용을 비교할 시 true
        }else {
            System.out.println(false);
        }

        String str3 = "HelloWorld"; // 문자열 리터럴 Literal Pool
        String str4 = "HelloWorld";

        if(str3 == str4) {
            System.out.println(true); // 같은 주소값을 가리킴(재사용)
        }else {
            System.out.println(false);
        }

        if(str3.equals(str4)) {
            System.out.println(true);
        }else {
            System.out.println(false); // 같은 주소값을 가리킴(재사용)
        }
    }
}
