package org.example.part4.util;

public class GenericArray<T> {
    private T[] array;
    private int size;
    public GenericArray(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public void set(int index, T value) {
        array[index] = value;
        size++;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }
}
