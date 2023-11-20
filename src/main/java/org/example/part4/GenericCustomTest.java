package org.example.part4;

import org.example.part4.util.GenericArray;

public class GenericCustomTest {
    public static void main(String[] args) {
        GenericArray<String> array = new GenericArray<>(5);
        array.set(0, "Hello1");
        array.set(1, "Hello2");
        array.set(2, "Hello3");
        array.set(3, "Hello4");
        array.set(4, "Hello5");

        for (int i=0; i<array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
