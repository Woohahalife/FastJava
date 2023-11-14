package org.example.part4;

import java.util.Arrays;
import java.util.Random;

// 6개의 난수를 생성해 중복되지 않게 배열에 저장
public class RandomApiTest {
    public static void main(String[] args) {
        Random random = new Random(); // java.util.Random
        int[] arr = new int[6];
        int i = 0;
        while (i < 6) {
            int num = random.nextInt(45) + 1; // random.nextInt() : 랜덤 난수를 반환, 파라미터 설정 시 0이상 parameter-1의 난수 반환
            boolean isDuplicate = false;

            // 배열의 인덱스들과 비교해 중복을 확인
            for(int j=0; j<i; j++) {
                if(arr[j] == num) {
                    isDuplicate = true;
                    break;
                }

            }
            // 중복이 안될시 배열에 추가
            if(!isDuplicate) {
                arr[i++] = num;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
