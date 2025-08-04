package jungol.complate.배열1;

import java.util.Scanner;

public class 배열1_형성평가04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int [100];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array [i]==-1){
                break;
            }
            count++;
        }
        for (int j=count-3; j<=count-1; j++){
            System.out.print(array[j] + " ");
        }
    }
}
