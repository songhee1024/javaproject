package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class project_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] character = {"마법사", "영주", "기사", "농민"};
        int[] attackPoint = {100, 100, 100, 100};
        int num;
        int ch=10;
        do {
            System.out.println("---------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 선택");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("---------------------");
            System.out.println("메뉴 입력 => ");

            num = sc.nextInt();
            if(num==1)
                ch = new Random().nextInt(4);

            switch (num) {
                case 1:
                    System.out.println(character[ch] + "(으)로 설정되었습니다.");
                    break;

                case 2:
                    if (ch == 10) {
                        System.out.println("캐릭터를 먼저 설정하세요!");
                        break;
                    }
                    attackPoint[ch] += 10;
                    System.out.println(character[ch] + " 공격력이 증가되었습니다. 현재 공격력 : " + attackPoint[ch]);
                    break;

                case 3:
                    if (ch == 10) {
                        System.out.println("캐릭터를 먼저 설정하세요!");
                        break;
                    }
                    attackPoint[ch] -= 10;
                    System.out.println(character[ch] + " 공격력이 감소되었습니다. 현재 공격력 : " + attackPoint[ch]);
                    break;

                case 9:
                    System.out.println("이제 공부하세요!");
                    break;

                default:
                    System.out.println("없는 메뉴입니다");
                    break;
            }
        }while (num != 9) ;
    }
}

