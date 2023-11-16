package org.example.part4.util;

import org.example.part4.model.Book;

import java.util.Arrays;

public class ObjectArray {
    private Object[] elements; // 배열 선언
    private int size = 0; // 초기 용량 설정

    public ObjectArray() { // 객체 생성시 배열 생성
        // 초기 크기 설정
        this(5);
    }

    public ObjectArray(int CAPACITY) { // 객체 생성시 뭔하는 크기의 배열 생성
        // 초기 크기 설정
        elements = new Object[CAPACITY];
    }
    public int length() { // 현재 배열의 길이를 반환하는 메서드
        return elements.length;
    }

    public int size() { // 현재 배열의 용량을 반환하는 메서드
        return size;
    }

    public Object get(int index) { // 인덱스에 해당하는 배열에 저장된 개별값을 반환하는 메서드
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 초과했습니다.");
        }
        return elements[index];
    }

    public String getAll() { // 모든 배열을 출력(줄바꿈 추가)
        return Arrays.toString(elements).replace("}, ", "}\n");
    }

    public void add(Object element) { // 배열에 값을 저장하는 메서드
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() { // 배열의 길이를 늘려 반환하는 메서드
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
