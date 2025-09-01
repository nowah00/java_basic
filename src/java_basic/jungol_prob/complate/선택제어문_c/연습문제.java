package java_basic.jungol_prob.complate.선택제어문_c;

import java.util.Scanner;

public class 연습문제 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// 연습문제1
//        int a = in.nextInt();
//
//        System.out.println(a);
//         if (a > 10){
//             System.out.println("10보다 큰 수를 입력하셨습니다");
//         }

// 연습문제2
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        if (a > b){
//            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다",  a,b);
//        } else {
//            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다", b, a);
//        }

// 연습문제3
//        System.out.println("점수를 입력하세요.");
//        int a = in.nextInt();
//        if (a >= 80){
//            System.out.print("축하합니다. 합격입니다!");
//        } else {
//            System.out.print("불합격입니다.");
//        }

// 연습문제4
//------------me
//        int a = in.nextInt();
//        if (a >= 90){
//            System.out.print("A");
//        }
//        if (90 > a && a >= 80){
//            System.out.print("B");
//        }
//        if (80 > a && a >= 70){
//            System.out.print("C");
//        }
//        if (70 > a && a >= 60){
//            System.out.print("D");
//        }
//        if (60 > a && a >= 50){
//            System.out.print("E");
//        }
//------------teacher
//        try {
//        System.out.println("점수를 입력해주세요");
//        int a = in.nextInt();
//        char grade = 0;
//
//            if ((a >= 90) && (a <= 100)) grade = 'A';
//            else if ((a >= 80) && (a < 90)) grade = 'B';
//            else if ((a >= 70) && (a < 80)) grade = 'C';
//            else if ((a >= 60) && (a < 70)) grade = 'D';
//            else if ((a >= 0) && (a < 60)) grade = 'E';
//            else System.out.println("0-100 사이의 숫자를 입력해주세요");
//
//            System.out.println(grade);
//        } catch (InputMismatchException e) {
//            System.out.println("숫자만 입력이 가능합니다");
//        }

// 연습문제5
//        int a = in.nextInt();
//        int b = in.nextInt();
//
//        if (a >= 4 && b >= 4){
//            System.out.print("이겼습니다");
//        }
//        if (a >= 4 ^ b >= 4){
//            System.out.print("비겼습나다");
//        }
//        if (a < 4 && b < 4){
//            System.out.print("졌습니다");
//        }

// 연습문제6
//        System.out.println("세 수를 입력하세요.");
//        int number1 = in.nextInt();
//        int number2 = in.nextInt();
//        int number3 = in.nextInt();
//
//        int temp1 = Math.max(number1, number2);
//        int temp2 = Math.max(number2, number3);
//
//        int maxValue = Math.max(temp1, temp2);
//
//        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", maxValue);

// 연습문제7
//        System.out.println("1.삽입");
//        System.out.println("2.수정");
//        System.out.println("3.삭제");
//        System.out.println("숫자를 선택하세요.");
//        int number = in.nextInt();
//
//        if (number == 1) System.out.println("삽입을 선택하셨습니다.");
//        else if (number == 2) System.out.println("수정을 선택하셨습니다.");
//        else if (number == 3) System.out.println("삭제를 선택하셨습니다.");
//        else System.out.println("1, 2, 3 중 선택해주세요.");

// 연습문제8
//        System.out.println("점수를 입력하세요");
//        int a = in.nextInt();
//        char grade = 0;
//
//            if ((a >= 90) && (a <= 100)) grade = 'A';
//            else if ((a >= 80) && (a < 90)) grade = 'B';
//            else if ((a >= 70) && (a < 80)) grade = 'C';
//            else if ((a >= 60) && (a < 70)) grade = 'D';
//            else if ((a >= 0) && (a < 60)) grade = 'E';
//            else System.out.println("0-100 사이의 숫자를 입력해주세요");
//
//            System.out.println(grade);

// 연습문제9
        int a = in.nextInt();
        int b = in.nextInt();

        int result = (a > b) ? a : b;

        System.out.println(result);
    }
}
