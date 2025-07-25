package jungol.반복제어문2;

import java.util.Scanner;

public class 형성평가 {
    public static void main(String[] args) {

// 형성평가1
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("10 이하의 정수를 입력하세요");
//        int x = in.nextInt();
//        for (int i= 1 ; i <= x ; i++){
//            System.out.println("JUNGOL");

// 형성평가2
        Scanner in = new Scanner(System.in);

        System.out.println("100 이하의 정수를 입력하세요");
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = b ; i <= a ; i++){
            System.out.print(i + " ");

        }
    }
}
