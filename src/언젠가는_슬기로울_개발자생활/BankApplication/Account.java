package 언젠가는_슬기로울_개발자생활.BankApplication;

public class Account{
    private String accountNumber;
    private String user;
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    Account(String accountNumber, String user, int balance){
        this.accountNumber = accountNumber;
        this.user = user;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getUser() {
        return user;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int money) {
        int newBalance = this.balance + money;

        if(newBalance < MIN_BALANCE || newBalance > MAX_BALANCE){
            System.out.println("결과: 정상 처리되지않았습니다.");
            return;
        }
        System.out.println("결과: 정상 처리되었습니다.");
        this.balance = newBalance;
    }
}