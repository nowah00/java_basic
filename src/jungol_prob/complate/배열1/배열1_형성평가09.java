package jungol_prob.complate.배열1;

import java.util.Scanner;

public class 배열1_형성평가09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;
        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
                if (arr[i]==0){
                break;
            }
            count++;
        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0 && arr[i]%2!=0){
                odd = arr[i]*2;
                System.out.print(odd + " ");
            } else if (arr[i]!=0 && arr[i]%2==0) {
                even = arr[i] / 2;
                System.out.print(even + " ");
            } else if (arr[i]==0) {
                break;
            }
        }
    }
}
