package javabasic_02.day11.inheritance.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		dog.sound();
		cat.sound();
	}


}