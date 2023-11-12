package org.example.part2;

import org.example.part2.model.CarDAO;
import org.example.part2.model.CarDTO;

import java.util.Scanner;

public class CarCRUDTest {
    public static void main(String[] args) {
        //자동차 정보를 입력받아 DB에 저장
        CarDTO car = new CarDTO();

        carInsert(car);
        carSelect();

    }

    public static void carInsert(CarDTO car) {
        Scanner scan = new Scanner(System.in);
        System.out.println("자동차 일련번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 이름 : ");
        String carName = scan.nextLine();
        System.out.println("자동차 가격 : ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.println("자동차 연식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.println("자동차 타입 : "); // G(휘발유), D(경유)
        String carType = scan.nextLine();

        //콘솔로 받는 데이터를 DTO에 연결
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.createCar(car);
    }

    public static void carSelect() {
        CarDAO dao = new CarDAO();
        dao.insertCar();
    }

}
