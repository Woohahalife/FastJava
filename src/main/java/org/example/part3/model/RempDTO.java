package org.example.part3.model;

public class RempDTO extends Employee {

    public RempDTO(String name, String phone, int age, String empDate,
                   String dept, boolean isMarriged) {
        super(name, phone, age, empDate, dept, isMarriged); // super()메서드로 부모 생성자에게 값을 전달
    }
}
