package javabagic_02.day10.morningtest.bankApplication;

import java.util.Scanner;

public class BankApplication {
    static Scanner in = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int count = 0; // 계좌의 개수

    // 계좌번호로 Account 를 찾는 메소드
    private static Account findAccount(String accountNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNo().equals(accountNo)) {
                return accounts[i];
            }
        }
        return null; // 못 찾았으면 null
    }

    // 계좌생성 기능
    private static void createAccount() {
        System.out.println("------");
        System.out.println("계좌생성");
        System.out.println("------");

        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();
        System.out.print("계좌주 : ");
        String owner = in.nextLine();
        System.out.print("초기입금액 : ");   // 계산을 위한 정수로 형변환
        int balance = Integer.parseInt(in.nextLine());

        // 위에 정보들이 newAccount 객체에 저장
        Account newAccount = new Account(accountNo, owner, balance);

        accounts[count] = newAccount; // 배열에 정보들을 저장
        count++; // 계좌 카운트

        System.out.println("결과 : 계좌가 생성 되었습니다.");
    }


    // 계좌목록 기능
    private static void accountList(){
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            System.out.printf("계좌번호: %s, 계좌주: %s, 잔액: %d\n",
                    acc.getAccountNo(), acc.getOwner(), acc.getBalance());
        }
    }


    // 예금 기능
    private static void deposit() {
        System.out.println("------");
        System.out.println("예금");
        System.out.println("------");

        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();

        Account acc = findAccount(accountNo); // 계좌 찾기

        if (acc == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("입금액 : ");
        int money = Integer.parseInt(in.nextLine());

        acc.setBalance(money); // 입금 처리
        System.out.println("결과 : 정상 처리되었습니다.");
    }


    // 출금 기능
    private static void withdraw() {
        System.out.println("------");
        System.out.println("출금");
        System.out.println("------");

        System.out.print("계좌번호 : ");
        String accountNo = in.nextLine();

        Account acc = findAccount(accountNo); // 계좌 찾기

        if (acc == null) {
            System.out.println("해당 계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("출금액 : ");
        int money = Integer.parseInt(in.nextLine());

        if (money <= 0) {
            System.out.println("출금액은 0보다 커야 합니다.");
            return;
        }

        if (acc.getBalance() < money) {
            System.out.println("잔액이 부족합니다. 현재 잔액: " + acc.getBalance());
            return;
        }

        acc.setBalance(-money); // 출금 처리
        System.out.println("결과 : 출금이 완료되었습니다.");
    }


    // 종료 기능
    private static boolean exitApp() {
        System.out.println("프로그램을 종료합니다.");
        return false;
    }


    // Bank application 시작 - main()
    public static void main(String[] args) {
        boolean run = true;
        while (run){
            String menu = """
                    ====================================
                     1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료
                    ====================================
                    """;
            System.out.println(menu);
            System.out.println("선택>");

            int choice = Integer.parseInt(in.nextLine());
            switch (choice){
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> run = exitApp();
                default -> System.out.println("1-5번 사이에서 선택해주세요.");
            }
        }
    }
}