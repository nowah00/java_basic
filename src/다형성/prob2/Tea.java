package 다형성.prob2;

public class Tea extends Beverage {
    public static int amount;

    Tea(String name){
        super(name);
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Tea.amount = amount;
    }

    @Override
    void calcPrice() {
        if (this.name == "LemonTea"){
            this.setPrice(1500);
        } else if (this.name == "ginsengTea"){
            this.setPrice(2000);
        } else if (this.name == "redginsengTea"){
            this.setPrice(2500);
        }
        amount++;
    }
}
