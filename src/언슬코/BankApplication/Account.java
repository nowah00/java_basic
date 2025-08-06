package 언슬코.BankApplication;

public class Account{
    private String accNum;
    private String owner;
    private int balance;
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    Account(String accNum, String owner, int balance){
        this.accNum = accNum;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int money) {
        int newBalance = this.balance + money;

        if(newBalance < MIN_BALANCE || newBalance > MAX_BALANCE){
            System.out.println("결과: 처리할 수 없습니다.");
            return;
        }
        System.out.println("결과: 성공적으로 처리하였습니다.");
        this.balance = newBalance;
    }
}