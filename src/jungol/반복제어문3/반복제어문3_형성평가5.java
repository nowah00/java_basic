package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n;

        for (int i=1; i<=n; i++){

            for (int j=2*m-2; j>=1; j--){
                System.out.print(" ");
            }
            m--;

            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

