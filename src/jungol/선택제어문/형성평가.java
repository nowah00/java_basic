package jungol.선택제어문;

import java.util.Scanner;

public class 형성평가 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// 형성평가1
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        int r1 = a - b;
//        int r2 = b - a;
//
//        if (a > b){
//            System.out.println(r1);
//        } else {
//            System.out.println(r2);
//        }

// 형성평가2
//        int a = in.nextInt();
//        if (a > 0){
//            System.out.println("plus");
//        } else if (a == 0) {
//            System.out.println("zero");
//        } else {
//            System.out.println("minus");
//        }

// 형성평가3
//        int year = in.nextInt();
//
//        int lp = year % 4;
//
//        if (lp == 0) {
//            System.out.println("leap year");
//        } else {
//            System.out.println("common year");
//        }

// 형성평가4
//        System.out.println("Number?");
//        int a = in.nextInt();
//
//        if (a == 1) {
//            System.out.println("dog");
//        } else if (a == 2) {
//            System.out.println("cat");
//        } else if (a == 3) {
//            System.out.println("chick");
//        } else {
//            System.out.println("1, 2, 3 중 선택해주세요.");
//        }

// 형성평가5
//        int a = in.nextInt();
//
//        if (a == 1) {
//            System.out.println("31");
//        } else if (a == 2) {
//            System.out.println("28");
//        } else if (a == 3) {
//            System.out.println("31");
//        } else if (a == 4) {
//            System.out.println("30");
//        } else if (a == 5) {
//            System.out.println("31");
//        } else if (a == 6) {
//            System.out.println("30");
//        } else if (a == 7) {
//            System.out.println("31");
//        } else if (a == 8) {
//            System.out.println("31");
//        } else if (a == 9) {
//            System.out.println("30");
//        } else if (a == 10) {
//            System.out.println("31");
//        } else if (a == 11) {
//            System.out.println("30");
//        } else if (a == 12) {
//            System.out.println("31");
//        } else {
//            System.out.println("1월부터 12월 중 선택해주세요.");
//        }
// -----------------------------------------------------------------------------------------------------------------------
        int month = in.nextInt();

        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("1~12 사이의 숫자를 입력하세요.");
        }
    }
}
