package javabasic_02.day11.test.class03.prob3;

public class Duck {
    private String name;
    private int legs;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("오리(" + this.name + ")는 닐지 않습니다.");
    }

    public void sing(){
        System.out.println("오리(" + this.name + ")가 소리내어 웁니다.");
    }

    public String toString(){
        return "오리의 이름은 " + this.name + " 입니다.";
    }
}
