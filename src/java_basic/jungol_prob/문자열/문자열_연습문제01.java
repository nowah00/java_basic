package java_basic.jungol_prob.문자열;

import java.util.Scanner;

public class 문자열_연습문제01 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {


        while(true){
            String inputStr = in.next();
            char ch = inputStr.charAt(0);
            System.out.println(ch + "->" + (int)ch);
            if (ch =='0') break;
        }
    }
}
