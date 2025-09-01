package practice02_exception.exceptionProb.PaymentTest;

public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment){
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public void pay() throws PayException {
        if (this.productPrice <= 0 || this.monthlyInstallment < 0){throw new PayException("가격이나 할부개월수가 잘못되었습니다");}
    }

    public String toString(){
        return
        "신용카드가 정상적으로 지불되었습니다." + "\n" +
        "[ 신용카드 경제 정보 ]" + "\n" +
        "상점명: " + this.shopName + "\n" +
        "상품명: " + this.productName + "\n" +
        "상품가격: " + this.productPrice + "\n" +
        "신용카드번호: " + this.cardNumber + "\n" +
        "할부개월: " + this.monthlyInstallment;
    }
}
