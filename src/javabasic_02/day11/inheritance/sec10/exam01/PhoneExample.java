package javabasic_02.day11.inheritance.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {

		Phone[] phone = {new SmartPhone("하원"), new FeaturePhone("예림")};

		for (int i = 0; i < phone.length; i++) {
			phone[i].turnOn();
			phone[i].call();
			phone[i].turnOff();
		}
	}
}