package org.example.part1;

public class CharTest {
    public static void main(String[] args) {
        //Q. '1'+'2'=3이 나오도록 프로그래밍
        char one = '1';
        char two = '2';
        int sum;
        sum = Character.getNumericValue(one+two) + Character.getNumericValue(two);
        System.out.println("sum = " + sum);

    }
}
