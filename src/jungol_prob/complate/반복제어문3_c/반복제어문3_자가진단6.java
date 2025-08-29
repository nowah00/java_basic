package jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_자가진단6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = n;
        int code = 65;

        for (int i=1; i<=n; i++){
            for (int j=a; j>=1; j--){
                System.out.print((char)code);
                code++;
            }
            a--;
            System.out.println();
        }
    }
}