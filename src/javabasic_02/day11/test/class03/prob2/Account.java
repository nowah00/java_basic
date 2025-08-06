package javabasic_02.day11.test.class03.prob2;

public class Account {
    private String accNo;
    private int balance;

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        System.out.println(accNo + " 계좌가 개설되었습니다.");
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int save(int money){
        int newBalance = this.balance + money;
        System.out.println(this.accNo + " 계좌에 " + money + "만원이 입금되었습니다.");
        this.balance = newBalance;
        return this.balance;
    }

    public int deposit(int money){
        int newBalance = this.balance - money;
        System.out.println(this.accNo + " 계좌에 " + money + "만원이 출금되었습니다.");
        this.balance = newBalance;
        return this.balance;
    }
}
