package org.example.part2;

import org.example.part2.model.CarDTO;
import org.example.part2.util.CarUtility;

import java.util.function.Consumer;

public class CarUtilityTest {
    public static void main(String[] args) {
        int carSn = 1110;
        String carName = "k5";
        int carPrice = 50000000;
        String carOwner = "최건";
        int carYear = 7;
        String carType = "G(가솔린)";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarUtility util = new CarUtility();
        util.carPrint(car);
    }
}
