package javabasic_02.day11.test.class03.prob3;

public class Sparrow {
    private String name;
    private int legs;
    private int length;

    public void setName(String name) {
        this.name = name;
    }

    public void fly(){
        System.out.println("참새(" + this.name + ")가 닐아다닙니다.");
    }

    public void sing(){
        System.out.println("참새(" + this.name + ")가 소리내어 웁니다.");
    }

    public String toString(){
        return "참새의 이름은 " + this.name + " 입니다.";
    }
}
