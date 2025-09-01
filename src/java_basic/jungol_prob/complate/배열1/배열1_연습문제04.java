package java_basic.jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_연습문제04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] array = new int [100];

        for (int i = 1; i <= array.length; i++) {
            array[i] = in.nextInt();
            if (array[i]==0){
                break;
            }
        }

        for (int j = 1; j <= array.length; j++) {
            if (j%2==0){
                if (array[j]==0){
                    break;
                }
                System.out.print(array[j] + " ");
            }
        }
    }
}
