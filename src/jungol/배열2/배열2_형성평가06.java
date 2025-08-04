package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] number = new int[5][5];

        for (int i = 0; i < 5; i++) {
            if (i==1||i==3){
                number[0][i]=0;
            } else {
//                number[i] = 1;
            }
        }

//        for (int i = 1; i < 5; i++) {
//            for (int j = 1; j < 5; j++) {
//                    number[i][j] = number[i - 1][j - 1] + number[i - 1][j + 1];
//            }
//        }

        for (int i = 0; i < 5; i++) {
            System.out.print(number[0][i]);
        }
    }
}