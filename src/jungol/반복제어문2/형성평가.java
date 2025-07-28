package jungol.반복제어문2;

import java.util.Scanner;

public class 형성평가 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
// 형성평가1
//        int x = in.nextInt();
//        for (int i= 1 ; i <= x ; i++){
//            System.out.println("JUNGOL");

// 형성평가2
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        for (int i = b ; i <= a ; i++){
//            System.out.print(i + " ");

// 형성평가3
//        int a = in.nextInt();
//        int x = 0;
//
//        for (int i = 1 ; i <= a ; i++) {
//            if (i % 5 == 0){
//                x = x + i ;
//            }
//        }
//
//        System.out.println(x);

// 형성평가4
//        int n1 = in.nextInt();
//        int x = 0;
//
//        for (int i = 1 ; i <= n1 ; i++) {
//            int n2 = in.nextInt();
//            x = x + n2;
//        }
//
//        float r = (float) x / n1;
//
//        System.out.printf("%.2f", r);

// 형성평가5
//        int x1 = 0;
//        int x2 = 0;
//
//        for (int i = 0; i < 10; i++) {
//            int num = in.nextInt();
//            if (num % 2 == 0) {
//                x1++;
//            } else {
//                x2++;
//            }
//        }
//
//        System.out.printf("enen : %d\n odd : %d", x1, x2);

// 형성평가6
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int sum = 0;
//        int count = 0;
//
//        for (int i = Math.min(a, b) ; i <= Math.max(a, b) ; i++) {    // for 문의 작은 값 큰 값 고정 꼭 하기!!
//                if (i % 3 == 0 || i % 5 == 0) {
//                    sum = sum + i;
//                    count++;
//                }
//        }
//        double avg = (double) sum / count;
//        System.out.printf("sum : %d\navg : %.1f", sum, avg);

// 형성평가7
//        int n = in.nextInt();
//
//        for (int i = 1 ; i <= 10 ; i++) {
//            if (n % n == 0){
//                int r = n * i;
//                System.out.printf("%d ", r);
//            }
//        }

// 형성평가8
//        int x, y;
//        y = in.nextInt();
//        x = in.nextInt();
//
//        for (int i = 1; i <= y; i++){
//            for(int j = 1; j <= x; j++){
//                System.out.print(i * j + " ");
//            }
//            System.out.println();
//        }

// 형성평가9
//        int a = in.nextInt();
//
//        for (int i = 1; i <= a; i++){
//            for (int j = 0; j < a; j++){
//                System.out.printf("(%d, %d) ", i, j+1);
//            }
//            System.out.println();
//        }

// 형성평가10
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            for (int i = 1; i <= 9; i++) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        }
    }
}



