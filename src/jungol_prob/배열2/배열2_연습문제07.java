package jungol_prob.배열2;

public class 배열2_연습문제07 {
    public static void main(String[] args) {
        int[][] number = new int[5][5];

        for (int i = 0; i < 5; i++) {
            number[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                number[i][j] = number[i - 1][j] + number[i - 1][j - 1];
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
