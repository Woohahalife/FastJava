package org.example.part2.model;

public class PersonDTO {
    private String name;
    private int age;
    private String phone;

    //deault 생성자
    public PersonDTO() { }

    // 생성자를 통해 멤버변수 값을 초기화
    public PersonDTO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public int getAge() {
//        return age;
//    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public String getPhone() {
//        return phone;
//    }

//    public void setPhone(String phone) {
//        this.phone = phone;
//    }


    @Override
    public String toString() {
        return "PersonDTO {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
