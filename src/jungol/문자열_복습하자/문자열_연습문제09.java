package jungol.문자열_복습하자;

import java.util.Scanner;

public class 문자열_연습문제09 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String inpuString = in.nextLine();

        int lenOfStr = inpuString.length();

        for (int i = 1; i < lenOfStr; i++) {
            System.out.println(inpuString.substring(i) + inpuString.substring(0,i));
        }
    }
}
