package jungol_prob.complate.반복제어문3_c;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {
    public static void main(String[] args) {

// 1부터 차례로 누적하여 합을 구하다가
// 합이 입력받은 수를 넘으면 중단하고
// 마지막으로 더해진 값과 그 때까지의 합을 출력
        Scanner in = new Scanner(System.in);

//        int number = in.nextInt(); // 이게 입력한 수야.
//        int count = 0; // 이게 총합이고?
//
//        for (int i=1; i<=number; i++) { // 입력한 수까지 반복되게 만들고?
//            count = count + i; // 총합을 구해.
//            if (count > number) { // 총합이 입력한 수를 넘어갔을 때
//                System.out.print(i + " "); // 그 때의 진행 값 i 를 출력하고
//                break; // 멈춰.
//            }
//        }
//        System.out.print(count); // 총합까지~
//============================================================================================
        int n = in.nextInt();
        int number = 1;
        int total = 0;

        while (number <= n){
            total += number;
            if(total > n)break;
            ++number;
        }

        System.out.printf("%1$d %2$d", number, total);
    }
}
