package org.dimigo.inheritance;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] Phones = {
                new IPhone("IPhone XS", "애플", 1370000),
                new Galaxy("갤럭시 S10", "삼성", 1500000)
        };

        for(SmartPhone Phone : Phones){
            System.out.println(Phone);
            Phone.turnOn();
            Phone.pay();
            Phone.useSpecialFunction();
            Phone.turnOff();
            System.out.println();
        }
    }
}
