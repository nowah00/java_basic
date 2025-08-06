package 언슬코.BankApplication;

import java.util.Scanner;

public class BankApplication{
    static Scanner in = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int count = 0;
    static boolean on = true;

    public static void menu(){
        System.out.println("""
                ------------------------------------------
                1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
                ------------------------------------------""");
    }

    public static Account findAcc(String accNum){
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            if(acc.getAccNum().equals(accNum)){
                return accounts[i];
            }
        }
        return null;
    }

    public static void createAcc(){
        System.out.println("""
                ---------
                계좌생성
                ---------""");
        System.out.print("계좌번호: ");
        String accNum = in.nextLine();
        System.out.print("계좌주: ");
        String owner = in.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(in.nextLine());

        Account newAcc = new Account(accNum, owner, balance);

        accounts[count] = newAcc;
        count++;

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    public static void accList(){
        System.out.println("""
                ---------
                계좌목록
                ---------""");
        for (int i = 0; i < count; i++) {
            Account acc = accounts[i];
            System.out.println(acc.getAccNum() + "  " + acc.getOwner() + "  " + acc.getBalance());
        }
    }

    public static void addMoney(){
        System.out.println("""
                ---------
                입급
                ---------""");
        System.out.print("계좌번호: ");
        String accNum = in.nextLine();

        Account acc = findAcc(accNum);

        if(acc==null){
            System.out.println("결과: 해당 계좌를 찾을 수 없습니다.");
            return;
        }

        System.out.print("예금액: ");
        int money = Integer.parseInt(in.nextLine());

        if(money <= 0){
            System.out.println("결과: 잘못된 입력입니다.");
            return;
        }

        acc.setBalance(money);
    }

    public static void minusMoney(){
        System.out.println("""
                ---------
                출급
                ---------""");
        System.out.print("계좌번호: ");
        String accNum = in.nextLine();

        Account acc = findAcc(accNum);

        if(acc==null){
            System.out.println("결과: 해당 계좌를 찾을 수 없습니다.");
            return;
        }

        System.out.print("출금액: ");
        int money = Integer.parseInt(in.nextLine());

        if(money <= 0){
            System.out.println("결과: 잘못된 입력입니다.");
            return;
        }

        if(money > acc.getBalance()){
            System.out.printf("결과: 잔액이 부족합니다. 현재 잔액: %d\n", acc.getBalance());
            return;
        }

        acc.setBalance(-money);
    }

    public static boolean exit(){
        return false;
    }

    public static void main(String[] args) {
        while(on){
            try {
                menu();
                System.out.print("선택> ");
                int choice = Integer.parseInt(in.nextLine());
                switch (choice){
                    case 1 -> createAcc();
                    case 2 -> accList();
                    case 3 -> addMoney();
                    case 4 -> minusMoney();
                    case 5 -> on = exit();
                    default -> System.out.println("결과: 1-5사이의 숫자를 입력해주세요");
                    }
                } catch (NumberFormatException e){
                System.out.println("결과: 숫자를 입력해주세요.");
            }
        }
        System.out.println("프로그램 종료");
    }
}
