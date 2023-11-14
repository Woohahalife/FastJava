package org.example.part4.util;

public class RandomNumAPI {

    private RandomNumAPI() { }

    public static int[] RandomNum() {
        int[] arr = new int[50];
        for(int i = 0; i < 50; i++) {
            arr[i] = (int)(Math.random()*10000 + 1);
        }
        return arr;
    }
}
