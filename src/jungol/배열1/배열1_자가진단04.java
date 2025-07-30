package jungol.배열1;

import java.util.Scanner;

public class 배열1_자가진단04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i]==0){
                break;
            }
            count++;
        }
        for (int i = count-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
