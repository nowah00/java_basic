package jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_형성평가9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("# ");
            }
            System.out.println();
        }

        int o = n;
        for (int l=1; l<=n-1; l++){
            for (int m=1; m<=2*l; m++){
                System.out.print(" ");
            }
            for (int m=o-1; m>=1; m--){
                System.out.print("# ");
            }
            o--;
            System.out.println();
        }






    }
}

