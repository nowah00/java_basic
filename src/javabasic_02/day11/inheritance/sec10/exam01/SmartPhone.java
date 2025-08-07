package javabasic_02.day11.inheritance.sec10.exam01;

public class SmartPhone extends Phone {
    //생성자 선언
    SmartPhone(String owner) {
        super(owner);
    }

	//메소드 선언
    void internet(){
        System.out.println("인터넷을 사용합니다.");
    }

    @Override
    void call() {
        System.out.println("스마트폰으로 전화를 겁니다.");
    }
}