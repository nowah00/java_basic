package java00_basic.jungol_prob.complate.반복제어문1_c;

import java.util.Scanner;

public class 반복제어문1_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n");

        menu:
        while (true) {

            System.out.print("작업할 번호를 선택하세요. ");

            int choice = in.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("\n입럭하기를 선택하셨습니다.\n");
                    break;
                case 2 :
                    System.out.println("\n출력하기를 선택하셨습니다.\n");
                    break;
                case 3 :
                    System.out.println("\n삭제하기를 선택하셨습니다.\n");
                    break;
                case 4 :
                    System.out.println("\n끝내기를 선택하셨습니다.\n");
                    break menu;
                default:
                    System.out.println("잘못 입력하셨습니다.\n");
            }
        }
    }
}




