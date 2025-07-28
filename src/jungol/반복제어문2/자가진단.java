package jungol.반복제어문2;

import java.util.Scanner;

public class 자가진단 {
    public static void main(String[] args) {

// 자가진단1
        Scanner in = new Scanner(System.in);
//
//        char c = in.next().charAt(0);
//        for (int i = 19 ; i <=20 ; i++){
//            System.out.printf("%c",c);

// 자가진단2
//        for (int i = 10; i <= 20; i++) {
//            System.out.print(i + " ");
//        }

// 자가진단3
//        int num = in.nextInt();
//
//        for (int i = 1; i <= num; i++){
//            if (i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }

// 자가진단4
//        int num = in.nextInt();
//        int count = 0;
//
//        if (num <= 100) {
//            for (int i = num; i <= 100; i++){
//                count = count + i;
//            }
//        }
//        System.out.print(count);

// 자가진단5
//        int m = 0, M = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            int num = in.nextInt();
//            if (num % 3 == 0){
//                m++;
//            }
//            if (num % 5 == 0) {
//                M++;
//            }
//        }
//        System.out.printf("Multiples of 3 : %d\nMultiples of 5 : %d", m, M);

// 자가진단6
//        int num = in.nextInt();
//        int count = 0;
//
//        if (num <= 10) {
//            for (int i = 1; i <= num; i++) {
//                int score = in.nextInt();
//                count = count + score;
//            }
//        }
//
//        double avg = (double) count / num;
//        System.out.printf("avg : %.1f\n", avg);
//
//        if (avg >= 80){
//            System.out.println("pass");
//        } else {
//            System.out.println("fail");
//        }

// 자가진단7
//        for (int i = 1; i < 6; i++){
//            for (int j = 1; j < 6; j++) {
//                System.out.print(i + j + " ");
//            }
//            System.out.println();
//        }

// 자가진단8
        for (int i = 2; i <= 4; i++){
            for (int j = 1; j <= 5; j++){
                int result = i * j;
                System.out.printf("%d * %d = %d    ", i, j, result);
            }
            System.out.println();
        }
    }
}
