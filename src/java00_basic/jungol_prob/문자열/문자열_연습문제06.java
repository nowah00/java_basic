package java00_basic.jungol_prob.문자열;

import java.util.Scanner;

public class 문자열_연습문제06 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
         String str = in.nextLine();
         char ch = str.charAt(0);

         if((int) ch >= 123 || (int) ch <= 47 ){
             System.out.println("영문, 숫자 이외의 문자입니다.");
             break;
         }

          if(Character.isDigit(ch)){
              System.out.println("숫자 문자입니다");
          } else {
              System.out.println(Character.isUpperCase(ch) ? "대문자입니다" : "소문자입니다.");
          }
        }
    }
}
