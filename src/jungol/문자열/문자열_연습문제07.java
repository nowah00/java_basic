package jungol.문자열;

import java.util.Scanner;

public class 문자열_연습문제07 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String tmpStr = in.nextLine();
        int lenOfStr = tmpStr.length();

        for (int i = 0; i < lenOfStr; i++) {
            System.out.println(Character.isUpperCase(tmpStr.charAt(i)) ? Character.toLowerCase(tmpStr.charAt(i)) : Character.toUpperCase(tmpStr.charAt(i)));

        }



       
    }
}
