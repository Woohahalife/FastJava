package org.example.part2;

public class AllStaticTest {
    public static void main(String[] args) {

        // static 메서드를 사용하기엔 바람직하지 않은 방법임(인텔리제이에서도 경고를 띄움)
//        AllStatic st = new AllStatic();
//        System.out.println(st.sum(10,20));
//        System.out.println(st.max(10,20));
//        System.out.println(st.min(10,20));

        // static 메서드를 사용하는 바람직한 방법
        System.out.println(AllStatic.sum(10,20));
        System.out.println(AllStatic.max(10,20));
        System.out.println(AllStatic.min(10,20));
    }
}
