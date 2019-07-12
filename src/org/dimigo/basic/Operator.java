package org.dimigo.basic;

public class Operator {
    public static void main(String[] args) {
        int m=1700000, p=3, n=1500;

        System.out.println("<< 디미벅스 연간 인건비 >>");
        System.out.printf("월 평균 급여 : %,d원\n" ,m);
        System.out.printf("점포 내 직원 수 : %d명\n",p);
        System.out.printf("점포 수 : %,d개\n",n);
        System.out.printf("\n연간 인건비 : %,d원",m*12L*p*n);

    }
}