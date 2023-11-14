package org.example.part3.model;

public class Employee {
    private String name;
    private String phone;
    private int age;
    private String empDate;
    private String dept;
    private boolean isMarriged;

    public Employee() {}

    public Employee(String name, String phone, int age, String empDate,
                    String dept, boolean isMarriged) { // 부모클래스에서 직접 초기화
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.empDate = empDate;
        this.dept = dept;
        this.isMarriged = isMarriged;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", isMarriged=" + isMarriged +
                '}';
    }
}
