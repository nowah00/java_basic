package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] arr1 = new int [3][3];
        int [][] arr2 = new int [3][3];


        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.printf("첫 번째 배열 %d행 ", i);
                arr1[i][j] = in.nextInt();
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.printf("두 번째 배열 %d행 ", i);
                arr2[i][j] = in.nextInt();
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
