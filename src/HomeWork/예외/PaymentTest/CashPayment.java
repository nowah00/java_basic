package HomeWork.예외.PaymentTest;

public class CashPayment extends Payment {
    private String cashReceiptNumber;

    CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber){
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }

    @Override
    public void pay() throws PayException {
        if (this.productPrice <= 0){
            throw new PayException("가격이 잘못되었습니다.");
        }
        System.out.println("현금이 정상적으로 지불되었습니다.");
        System.out.println("[ 현금 경제 정보 ]");
    }

    public String toString(){
        return
        "상점명: " + this.shopName + "\n" +
        "상품명: " + this.productName + "\n" +
        "상품가격: " + this.productPrice + "\n" +
        "현금영수증번호: " + this.cashReceiptNumber;
    }
}
