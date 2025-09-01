package java_basic.jungol_prob.complate.반복제어문2_c;

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
// 연습문제1
//        int x;
//        System.out.println("10 이하의 정수를 입력하세요");
//        x = in.nextInt();
//        for (int i = 1 ; i <= x ; i++){
//            System.out.println("C언어 프로그래밍");
//        }

// 연습문제2
//        int ch = 65;
//        for (int i = 1 ; i <= 26 ; i++){
//
//            System.out.printf("%c", ch);
//            ch = ch + 1;
//        }

// 연습문제3
//        for (int i = 1 ; i < 21 ; i++) {
//            int a = i % 2;
//            if (a != 0){
//                System.out.print(i + " ");
//            }
//        }

// 연습문제4
//        int a = 0;
//        System.out.println("자연수를 입력하세요.");
//        int num = in.nextInt();
//        for (int i = 1 ; i <= num ; i++) {
//            a += i;
//        }
//        System.out.println(a);

// 연습문제5
//        int x = 0;
//
//        for (int i = 0; i < 10; i++) {
//            int num = in.nextInt();
//            if (num % 2 == 0) {
//                x = x + 1;
//            }
//        }
//
//        System.out.printf("입력받은 짝수는 %d개입니다.", x);

// 연습문제6
//        int count = 0;
//
//        for (int i = 1; i <= 5; i++){
//            int score = in.nextInt();
//            count = count + score;
//        }
//        double avg = (double) count / 5;
//        System.out.printf("총점 : %d\n평균 : %.1f", count, avg);

// 연습문제7
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++){
//                System.out.printf("%d ", i);
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++){
//                System.out.printf("%d ", j);
//            }
//            System.out.println();
//        }

// 연습문제8
        for (int j = 1; j <= 9; j++) {
            for (int i = 2; i <= 4; i++){
                int result = i * j;
                System.out.printf("%d * %d =  %d   ", i, j, result);
            }
            System.out.println();
        }
    }
}

