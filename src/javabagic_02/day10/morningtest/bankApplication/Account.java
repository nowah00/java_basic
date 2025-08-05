package javabagic_02.day10.morningtest.bankApplication;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 100000;
    private String accountNo; // 계좌번호 입력
    private String owner; // 계좌주 입력
    private int balance;   //통장 초기입금액 입력

    Account(String accountNo, String owner, int balance){
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(int money) {
        int newBalance = this.balance + money;

        if (newBalance < MIN_BALANCE || newBalance > MAX_BALANCE) {
            return;
        }
        this.balance = newBalance;
    }

    public int getBalance() {
        return this.balance;
    }
}




