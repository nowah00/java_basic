package java_basic.jungol_prob.배열2;

import java.util.Scanner;

public class 배열2_연습문제04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] num = new int[3][3];
        num[0][0]=3;
        num[0][1]=5;
        num[0][2]=4;
        num[1][0]=2;
        num[1][1]=6;
        num[1][2]=7;
        num[2][0]=8;
        num[2][1]=10;
        num[2][2]=1;

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
