package jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = n;

        int x = 1;

        for (int i=1; i<=n; i++){
            for (int k=0; k<=2*i-1; k++){
                System.out.print(" ");
            }
            for (int j=a; j>=1; j--){
                System.out.print(x + " ");
                x++;
            }
            a--;
            System.out.println();
        }







    }
}

