package org.example.part4.util;

public class MinMaxAPI {

    private MinMaxAPI() {}

    public static int MinNum(int[] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int MaxNum(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
