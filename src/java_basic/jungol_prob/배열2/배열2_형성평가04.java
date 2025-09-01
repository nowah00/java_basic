package java_basic.jungol_prob.배열2;

import java.util.Scanner;

public class 배열2_형성평가04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int sum=0;

        for (int i=0; i<4; i++){
            for (int j=0; j<3; j++){
                sum+=arr[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(sum);

    }
}