package org.example.part4;

import java.util.HashMap;
import java.util.Map;

public class MapTypeCharTest {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> map = new HashMap<>();

        char[] strArray = str.toCharArray(); // String문자열을 char배열로 변환

        // MapAPI를 활용해 중복된 char의 개수를 파악
        for(char c : strArray) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1); // 중복된 char가 있다면 해당 char의 개수를 +1
            }else {
                map.put(c, 1);
            }
        }
        System.out.printf("%s%n", map.entrySet());

        System.out.println("Char 개수");
        for(char c : map.keySet()) {
            System.out.println(c + ":" + map.get(c));
        }
    }
}
