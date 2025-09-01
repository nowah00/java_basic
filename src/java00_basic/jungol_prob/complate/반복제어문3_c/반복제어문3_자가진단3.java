package java00_basic.jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_자가진단3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = n;

        for (int i=1; i<=n; i++){
            for (int j=a; j>=1; j--){
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
        for (int l=1; l<=n; l++){
            for (int m=1; m<=l; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}