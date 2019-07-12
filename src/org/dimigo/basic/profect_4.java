package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class profect_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };
        int num, ch;

        do {
            System.out.println("----------------");
            System.out.println("1.질문 선택");
            System.out.println("2.정답 공개");
            System.out.println("9.프로그램 종료");
            System.out.println("----------------");
            System.out.print("메뉴 선택 => ");

            num = sc.nextInt();

            switch (num) {
                case 1:
                    ch = new Random().nextInt(3);
                    System.out.println(questions[ch]);
                    String answer = sc.next();
                    if (answer.equals(answers[ch]))
                        System.out.println("정답입니다!");
                    else
                        System.out.println("틀렸습니다!");
                    break;

                case 2:
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 3; i++) {
                        sb.append(questions[i]).append(" ").append(answers[i]).append("입니다.\n");
                    }
                    System.out.println("<< 정답 출력 >>");
                    System.out.println(sb);
                    break;


                case 9:
                    System.out.println("Bye~");
                    sc.close();
                    break;

                default:
                    System.out.println("없는 메뉴입니다.");

            }
        } while (num != 9);
    }
}



