package org.example.part1;


public class FindAPI {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a = " + a);

        /*
        * "APPLE" 문자열 저장 후 출력
        * String은 참조형 자료형이지만 컴파일러에 걸러지지 않는다.
        * 자바에서 기본 API로(External Libraries) String을 제공해주기 때문에
        * 컴파일러가 해당 참조형이 있는 클래스에서 탐색함
        */
        String word = "APPLE";
        System.out.println("word = " + word);
        System.out.println(word.toLowerCase());
    }
}
