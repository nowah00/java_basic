package HomeWork.InheritanceProb3;

public class CheckingAccount {
    private String accId;
    private long balance;
    private String ownerName;
    private String cardNo;

    CheckingAccount(String accId, String ownerName, long balance, String cardNo){
        this.accId = accId;
        this.ownerName = ownerName;
        this.balance = balance;
        this.cardNo = cardNo;
    }

    public String getAccId() {
        return accId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void pay(String cardNo, long amount){
        if (cardNo != this.cardNo) {
            System.out.println("지불이 불가능합니다.");
            return;
        }
        if (amount > this.getBalance()){
            System.out.println("지불이 불가능합니다.");
            return;
        }
        this.balance = this.getBalance() - amount;
    }
}
