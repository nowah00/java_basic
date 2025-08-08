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
        if (this.name.equals("LemonTea")){
            this.setPrice(1500);
        } else if (this.name.equals("ginsengTea")){
            this.setPrice(2000);
        } else if (this.name.equals("redginsengTea")){
            this.setPrice(2500);
        }
        amount++;
    }
}
