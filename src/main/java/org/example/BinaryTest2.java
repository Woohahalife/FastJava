package org.example;

public class BinaryTest2 {

    public static void main(String[] args) {
        // 10진수를 2, 16, 8진수로 바꿔주는 메서드 사용
        int data = 123;
        String binary = Integer.toBinaryString(data);
        System.out.println("binary = " + binary);
        String octal = Integer.toOctalString(data);
        System.out.println("octal = " + octal);
        String hexa = Integer.toHexString(data);
        System.out.println("hexa = " + hexa);
    }

}
