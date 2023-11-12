package org.example.part2.model;

public class CarDAO {

    public void createCar(CarDTO car) {
        //DB연결, Insert SQL
        System.out.println("car정보가 DB에 저장됨");
    }

    public void insertCar() {
        System.out.println("car정보가 표시됨");
    }
}
