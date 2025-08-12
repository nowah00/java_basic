package HomeWork.다형성.prob2;

abstract class Beverage {
    public String name;
    public int price;

    Beverage(String name){
        this.name = name;
    }


    abstract void calcPrice();

    void print(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
