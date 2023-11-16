package org.example.part4.util;

import java.util.Arrays;

public class IntArray {
    private int[] elements; // 배열 선언
    private int size = 0; // 초기 용량 설정

    public IntArray() { // 객체 생성시 배열 생성 및 크기 할당되도록 설계
        // 초기 크기 설정
        final int DEFAULT_CAPACITY = 5;
        elements = new int[DEFAULT_CAPACITY];
    }
    public int length() { // 현재 배열의 길이를 반환하는 메서드
        return elements.length;
    }

    public int size() { // 현재 배열의 용량을 반환하는 메서드
        return size;
    }

    public int get(int index) { // 인덱스에 해당하는 배열에 저장된 개별값을 반환하는 메서드
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 초과했습니다.");
        }
        return elements[index];
    }

    public void add(int element) { // 배열에 값을 저장하는 메서드
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() { // 배열의 길이를 늘려 반환하는 메서드
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    /*
     * Arrays.copyOf(T[] original, int newLength)
     * - 파라미터로 받은 배열을 복사해 새로운 배열을 만들어서 반환
     * - 리턴되는 새로운 배열의 길이는 2번째 파라미터로 지정
     */
}
