package jungol_prob.문자열;

import java.util.Scanner;

public class 문자열_연습문제03 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String str = "jungol olympiad";

        for (int i=0; i<5; i++){
            int targetNum = in.nextInt();
            if (targetNum > 14 || targetNum < 0){
                break;
            }
            System.out.println(str.charAt(targetNum));
        }
    }
}
