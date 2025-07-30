package javabagic_01.Day05;

import java.util.Scanner;

public class Practice_ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = in.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        int userPhone = in.nextInt();

        System.out.println("*****************************************************");
        System.out.println("             Welcome to Shopping Mall");
        System.out.println("             ] Welcome to Book Market!");
        System.out.println("*****************************************************");
        System.out.println("1. 고객 정보 확인하기         4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기     5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기            6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기            8. 종료");
        System.out.println("******************************************************");


        Menu:
        while (true) {
            System.out.print("메뉴 번호를 선택하세요 : ");
            int menuNum = in.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.println("현재 고객 정보 :");
                    System.out.printf("이름 %s   연락처 %s\n\n", userName, userPhone);
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    break Menu;
                default:
                    System.out.println("1번부터 8번 사이에 번호를 선택해주세요.");
            }
        }
        System.out.println("*****************************************************");
        System.out.println("             Welcome to Shopping Mall");
        System.out.println("             ] Welcome to Book Market!");
        System.out.println("*****************************************************");
    }
}