package org.example.part2;

import org.example.part2.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

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


        CarDTO car = new CarDTO();
        //콘솔로 받는 데이터를 DTO에 연결
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        carInfo(car); // 인자로 인스턴스Car를 전달

    }
    //Q. 매개변수로 자동차의 정보를 받아서 출력하는 메서드
    public static void carInfo(CarDTO car) { // call By Reference 형식으로 객체를 매개변수로 전달

        System.out.println(
                "자동차 일련번호: " + car.carSn + "\n" +
                        "자동차 이름: " + car.carName + "\n" +
                        "자동차 가격: " + car.carPrice + "\n" +
                        "자동차 소유자: " + car.carOwner + "\n" +
                        "자동차 연식: " + car.carYear + "\n" +
                        "자동차 타입: " + car.carType);
    }
}
