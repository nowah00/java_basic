package jungol_prob.문자열;

import java.util.Scanner;

public class 문자열_자가진단01 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            System.out.printf("ASCII code =? ");
         int numberCode = in.nextInt();

         if(numberCode>=33 && numberCode<=127){
             System.out.print((char)numberCode);
             System.out.println();
         } else break;
        }
    }
}
