package java00_basic.homework.PolymorphismProb.prob2;

abstract class Content {
    public String title;
    public int price;

    Content(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract void totalPrice();

    public void show(){
        System.out.println(this.getTitle() + "비디오의 가격은 " + this.getPrice() + "원 입니다.");
    }
}
