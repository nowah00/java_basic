package java00_basic.jungol_prob.배열2;

public class 배열2_형성평가06 {
        public static void main(String[] args) {
            int[][] arr = new int[5][5]; // 5행 5열 배열 선언

            arr[0][0] = 1;
            arr[0][2] = 1;
            arr[0][4] = 1;

            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    int left = (j - 1 >= 0) ? arr[i - 1][j - 1] : 0;
                    int right = (j + 1 < 5) ? arr[i - 1][j + 1] : 0;
                    arr[i][j] = left + right;
                }
            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
    }
}