package org.dimigo.oop;

public class CarTest2 {
    public static void main(String[] args) {

        Car2[] c = {
                new Car2("현대자동차", "제네시스", "검정색", 225, 50000000),
                new Car2("기아자동차", "K7", "흰색", 246, 40000000),
                new Car2("삼성자동차", "SM7", "회색", 200, 38000000)
        };

        System.out.println("<< 자동차 목록 >>");
        for(Car2 cars : c){
            System.out.println("제조사명 : " + cars.getCompany());
            System.out.println("모델명 : " + cars.getModel());
            System.out.println("색상 :" + cars.getColor());
            System.out.println("최대속도 :" + cars.getMaxSpeed() + "km");
            System.out.printf("가격 : %,d원\n\n", cars.getPrice());
        }


    }
}
