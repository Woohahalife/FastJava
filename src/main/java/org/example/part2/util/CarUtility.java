package org.example.part2.util;

import org.example.part2.model.CarDTO;

public class CarUtility {
    public static void carPrint(CarDTO car) {
        System.out.println(
                "자동차 일련번호: " + car.carSn + "\n" +
                        "자동차 이름: " + car.carName + "\n" +
                        "자동차 가격: " + car.carPrice + "\n" +
                        "자동차 소유자: " + car.carOwner + "\n" +
                        "자동차 연식: " + car.carYear + "\n" +
                        "자동차 타입: " + car.carType);
    }
}
