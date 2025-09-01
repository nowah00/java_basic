package java00_basic.jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_자가진단7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = n;
        int num = 1;
        int code = 65;

        for (int i=1; i<=n; i++) {
            for (int j=a; j>=1; j--){
                System.out.print(num + " ");
                num++;
            }
            a--;
            for (int k=1; k<=i; k++){
                System.out.print((char)code + " ");
                code++;
            }
            System.out.println();
        }
    }
}