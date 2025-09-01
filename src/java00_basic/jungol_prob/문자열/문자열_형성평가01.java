package java00_basic.jungol_prob.문자열;

import java.util.Scanner;

public class 문자열_형성평가01 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int add=0, minus = 0;

        System.out.println("영문자 두 개를 입력하세요.");

            char ch1 = in.next().charAt(0);
            char ch2 = in.next().charAt(0);

            add = ch1 + ch2;
            minus = Math.max(ch1,ch2) - Math.min(ch1,ch2);

        System.out.print(add + " " + minus);
    }
}
