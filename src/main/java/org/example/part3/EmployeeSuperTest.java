package org.example.part3
        ;


import org.example.part3.model.RempDTO;

public class EmployeeSuperTest {
    public static void main(String[] args) {
        RempDTO dto = new RempDTO("김자식", "010-4444-9999"
                , 26, "990113", "학생", false); // 객체 생성 및 초기화 -> super()메서드를 통해 부모의 생성자를 직접 초기화

        System.out.println(dto.toString());
    }
}
