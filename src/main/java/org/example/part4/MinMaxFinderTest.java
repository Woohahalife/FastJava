package org.example.part4;

import org.example.part4.util.MinMaxAPI;
import org.example.part4.util.RandomNumAPI;

public class MinMaxFinderTest {
    public static void main(String[] args) {

        int[] arr = RandomNumAPI.RandomNum(); // Random의 결과값을 배열로 생성( 1 ~ 10000 )

        System.out.printf("min value = %s%n", MinMaxAPI.MinNum(arr)); // 최소값 반환
        System.out.printf("max value = %s%n", MinMaxAPI.MaxNum(arr)); // 최대값 반환
    }
}
