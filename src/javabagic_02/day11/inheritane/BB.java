package javabagic_02.day11.inheritane;

public class BB extends AA {
    private int cc = 30;

    void adder(){
        int result = this.getAA() + this.getBB() + cc;

        System.out.println(result);
    }

    public int getCC(){
        return cc;
    }
}
