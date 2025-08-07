package javabasic_02.day11.inheritance.sec10.exam01;

public class FeaturePhone extends Phone {

    FeaturePhone(String owner) {
        super(owner);
    }

    @Override
    void call() {
        System.out.println("피처폰으로 전화를 겁니다.");
    }
}
