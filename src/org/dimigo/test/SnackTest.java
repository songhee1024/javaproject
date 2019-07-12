package org.dimigo.test;

public class SnackTest {
    public static void main(String[] args) {
        Snack[] snacks = {
                new Snack("새우깡","농심",1100,2),
                new Snack("콘칲","크라운",1200,3)
        };

        int sum=0;

        for(Snack s : snacks){
            s.toString();
            sum +=s.calcPrice();
        }
        System.out.println(sum);
    }
}
