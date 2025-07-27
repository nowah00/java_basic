package jungol.연산자;

import java.util.Scanner;

public class 자가진단 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// 자가진단1
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int result1 = a + b + c;
//        int result2 = (int) result1 / 3;
//
//        System.out.printf("sum = %d\navg : %d", result1, result2);

//자가진단2
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        int r1 = a + 100;
//        float r2 = b % 10f;
//
//        System.out.printf("%d %f", r1, r2);

// 자가진단3
//        int a = in.nextInt();
//
//        System.out.println(a);
//
//        a++;
//
//        a++;
//
//        int r2 = a;
//
//        System.out.println(a);

// 자가진단4
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        --b;
//        int r = a * b;
//        a++;
//
//        System.out.printf("%d %d %d", a, b, r);

// 자가진단5
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        if (a == b){
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }
//        if (a != b){
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }

// 자가진단6
        int a = in.nextInt();
        int b = in.nextInt();

        if (!(a > b)){
            System.out.printf("%d > %d --- 0\n", a, b);
        }

        if (a < b){
            System.out.printf("%d < %d --- 1\n", a, b);
        }
        if (!(a >= b)){
            System.out.printf("%d >= %d --- 0\n", a, b);
        }

        if (a <= b){
            System.out.printf("%d <= %d --- 1", a, b);
        }

// 자가진단7

    }
}
