package javabagic_01.Day05.WhileEx;

import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1부터 100까지 합을 출력하는 프로그램 - while 문을 이용
        int loop = 1;
        int total = 0;

        while(loop <=100){
            total += loop; // total = total + loop;
            loop++;
        }
        System.out.print(total);
    }
}
