package javabagic_02.day09.methods;

import java.util.Scanner;

public class Calculator_Ex1 {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;
    public static String[] dataSplit(String inputData){
        String[] data = inputData.split(" ");
        return data;
    }
    public static void main(String[] args) {
        while (a) {
            System.out.println("===================================\n           사칙연산 계산기           \n===================================\n 1.덧셈  2.뺄셈  3.곱셈  4.나눗셈  5.종료");
            System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.");

            // split() 구분자를 스페이스        두 수와 계산가능 번호 한줄로 받기
            String inputDate = sc.nextLine();
            if(inputDate.equals("5")){
                System.out.println("프로그램 종료");
                break;
            }
            String[] data = dataSplit(inputDate);
            calculator(data);
        }
    }

    //사용자가 입력한 아이디와 비밀번호를 idPwPrint()를 이용하여 출력하세요.
    public static void calculator(String[] data) {
        int num1,num2,result,menuNum = 0;
        num1 = Integer.parseInt(data[0]); // 문자열에 숫자를 수로 바꿔서 받음
        num2 = Integer.parseInt(data[1]);
        menuNum = Integer.parseInt(data[2]);

        switch (menuNum) {
            case 1: System.out.printf("%d + %d = %d \n",num1, num2, num1 + num2); break;
            case 2: System.out.printf("%d - %d = %d \n",num1, num2, num1 - num2); break;
            case 3: System.out.printf("%d * %d = %d \n",num1, num2, num1 * num2); break;
            case 4: System.out.printf("%d / %d = %.1f \n",num1, num2,(double) num1 / num2); break;
            case 5: a = false;
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("숫자만 입력해주세요.");
        }
    }
}









