package 언젠가는_슬기로울_코더생활.BankApplication;

import java.util.Scanner;

public class BankApplication{
    static Scanner in = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int count = 0;
    static boolean banking = true;

    //Find Account
    public static Account findAccount(String accountNumber){
        for (int i = 0; i < count; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    //Create Account
    public static void createAccount(){
        System.out.println("""
                ---------
                계좌생성
                ---------""");
        System.out.print("계좌번호: ");
        String accountNumber = in.nextLine();
        System.out.print("계좌주: ");
        String user = in.nextLine();
        System.out.print("초기입급액: ");
        int balance = Integer.parseInt(in.nextLine());

        Account newAccount = new Account(accountNumber, user, balance);

        accounts[count] = newAccount;
        count++;

        System.out.println("결과: 계좌가 개설되었습니다.");
    }

    //Account List
    public static void accountList(){
        System.out.println("""
                ---------
                계좌목록
                ---------""");
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            System.out.println(acc.getAccountNumber() + "  " + acc.getUser() + "  " + acc.getBalance());
        }
    }

    //Add Money
    public static void addMoney(){
        System.out.println("""
                ---------
                예금
                ---------""");
        System.out.print("계좌번호: ");
        String accountNumber = in.nextLine();

        Account acc = findAccount(accountNumber);

        if(acc == null){
            System.out.println("결과: 해당 계좌를 찾을 수 없습니다.");
            return;
        }

        System.out.print("예금액: ");
        int money = Integer.parseInt(in.nextLine());

        if(money <= 0){
            System.out.println("결과: 잘못된 입력입니다");
            return;
        }

        acc.setBalance(money);
    }

    //Minus Money
    public static void minusMoney(){
        System.out.println("""
                ---------
                출금
                ---------""");
        System.out.print("계좌번호: ");
        String accountNumber = in.nextLine();

        Account acc = findAccount(accountNumber);

        if(acc == null){
            System.out.println("해당 계좌를 찾을 수 없습니다.");
            return;
        }

        System.out.print("출금액: ");
        int money = Integer.parseInt(in.nextLine());

        if(money <= 0){
            System.out.println("결과: 잘못된 입력입니다");
            return;
        }

        if(money > acc.getBalance()){
            System.out.printf("결과: 잔액이 부족합니다. 잔액: %s\n", acc.getBalance());
            return;
        }

        acc.setBalance(-money);
    }

    //Exit
    public static boolean exit(){
        return false;
    }

    //Main
    public static void main(String[] args) {
        while(banking){
            try {
                System.out.println("""
                ------------------------------------------
                1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                ------------------------------------------""");
                System.out.print("선택> ");
                int choice = Integer.parseInt(in.nextLine());

                switch (choice){
                    case 1 -> createAccount();
                    case 2 -> accountList();
                    case 3 -> addMoney();
                    case 4 -> minusMoney();
                    case 5 -> banking = exit();
                    default -> System.out.println("결과: 1-5 사이의 수를 입력해주세요.");
                }
            } catch (NumberFormatException e){
                System.out.println("결과: 숫자를 입력해주세요.");
            }
        }
        System.out.println("프로그램 종료");
    }
}
