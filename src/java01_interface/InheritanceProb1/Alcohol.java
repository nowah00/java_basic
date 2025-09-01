package java01_interface.InheritanceProb1;

public class Alcohol extends Drink {

    private double alcPer;

    Alcohol(String name, int price, int count, double alcPer){
        super(name, price, count);
        this.alcPer = alcPer;
    }


    public static void printTitle() {
        System.out.println("상품명(도수[%]) 단가    수량   금액");
    }



    @Override
    public void printData() {
        System.out.printf("%s(%.1f)    %d    %d    %d\n", this.name, this.alcPer, this.price, this.count, this.getTotalPrice());
    }
}