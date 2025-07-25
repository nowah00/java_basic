package jungol.반복제어문2;

import java.util.Scanner;

public class 자가진단 {
    public static void main(String[] args) {

// 자가진단1
        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);
        for (int i = 19 ; i <=20 ; i++){
            System.out.printf("%c",c);
        }
    }
}
