package jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_연습문제3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("점수를 입력하세요.");
        int score = in.nextInt();

        while (0<= score && score <= 100){

            if (score >= 80){
                System.out.println("축하합니다. 합격입니다");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }

            System.out.println("점수를 입력하세요.");
            score = in.nextInt();
        }
    }
}
