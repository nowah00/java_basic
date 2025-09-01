package java_basic.homework.PolymorphismProb.prob2;

public class Coffee extends Beverage {
    public static int amount;

    Coffee(String name){
        super(name);
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Coffee.amount = amount;
    }

    @Override
    void calcPrice() {
        if (this.name.equals("Americano")){
            this.setPrice(1500);
        } else if (this.name.equals("CafeLatte")){
            this.setPrice(2500);
        } else if (this.name.equals("Cappuccino")){
            this.setPrice(3000);
        }
        amount++;
    }
}
