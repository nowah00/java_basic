package javabasic_02.day09.methodsBasic.calculator;

import java.util.Scanner;

public class Calculator_Ex2 {
    // 입력기능을 위한 스캐너 기능
    static Scanner in = new Scanner(System.in);

    // main
    public static void main(String[] args) {
        // 사용자에게 한 줄로 원하는 데이터 입력받기
        while(true) {
            menu();
            String inputData = in.nextLine();
            int[] fixData = inputDataPro(inputData);
            adder(fixData);
            minus(fixData);
            muliti(fixData);
            div(fixData);
        }
    }

    // 사용자 입력 데이터 처리 기능 : public static String[] inputDataPro(String inputData);
    public static int[] inputDataPro(String inputData) {
        String[] splitData = inputData.split(" ");
        int data1 = Integer.parseInt(splitData[0]);
        int data2 = Integer.parseInt(splitData[1]);
        int data3 = Integer.parseInt(splitData[2]);

        int[] datas = new int[]{data1,data2,data3};
        return datas;
    }

    // menu 기능 : public static void menu();
    public static void menu(){
        System.out.println("===================================\n           사칙연산 계산기           \n===================================\n 1.덧셈  2.뺄셈  3.곱셈  4.나눗셈  5.종료");
        System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.");
    }

    // 사칙연산 기능
    public static void adder(int[] datas){
        System.out.println(datas[0] + datas[1]);
    }
    public static void minus(int[] datas){
        System.out.println(datas[0] - datas[1]);
    }
    public static void muliti(int[] datas){
        System.out.println(datas[0] * datas[1]);
    }
    public static void div(int[] datas){
        try{
            int result = datas[0] / datas[1];
            System.out.println(result);
        } catch (Exception e){
            System.out.println("0으로 나누기 없기");
        }
    }
}









