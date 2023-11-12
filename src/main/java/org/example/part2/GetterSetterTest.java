package org.example.part2;

import org.example.part2.model.PersonDTO;

public class GetterSetterTest {
    public static void main(String[] args) {

        PersonDTO dto = new PersonDTO("구름이", 8, "010-8888-9999");


//        dto.setName("구름이");
//        dto.setAge(8);
//        dto.setPhone("010-8888-9999");

//        System.out.println(
//                        "이름 : " + dto.getName() + "\n" +
//                        "나이 : " + dto.getAge() + "\n" +
//                        "휴대폰번호 : " + dto.getPhone());

        System.out.println(dto.toString());

        //toString메서드 생략
        System.out.println(dto);
    }
}
