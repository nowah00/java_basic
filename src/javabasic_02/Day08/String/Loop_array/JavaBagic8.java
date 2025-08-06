package javabasic_02.Day08.String.Loop_array;
import java.util.Scanner;
public class JavaBagic8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = "------------------------------------\n 1.예금  |  2.출금  |  3.잔고  |  4.종료 \n------------------------------------\n";

        int total = 0;

        Choice:
        while(true){
            System.out.print("선택> ");
            int choice = in.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("예금액>");
                    int input = in.nextInt();
                    total = total + input;
                    break;
                case 2 :
                    System.out.print("출금액>");
                    int output = in.nextInt();
                    if (total < output){
                        System.out.print("잔액이 부족합니다\n");
                    } else {
                        total = total - output;
                    }
                    break;
                case 3 :
                    System.out.printf("잔고> %d\n", total);
                    break;
                case 4:
                    System.out.println("\n프로그램 종료");
                    break Choice;
                default:
                    System.out.println("1-4번 중 입력해주세요.");
                    break;
            }
            System.out.print("\n" + text);
        }
    }
}
