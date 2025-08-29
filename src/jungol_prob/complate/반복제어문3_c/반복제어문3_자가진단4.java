package jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_자가진단4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = n;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for (int k=a; k>=1; k--){
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
}