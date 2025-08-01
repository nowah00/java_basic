package jungol.문자열_복습하자;

import java.util.Scanner;

public class 문자열_연습문제08 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        String inputString = in.nextLine();

        String[] splitArray = inputString.split(" ");
        for (int i = 0; i < splitArray.length; i++) {
            String string = splitArray[i];
            System.out.println(string);
        }
    }
}
