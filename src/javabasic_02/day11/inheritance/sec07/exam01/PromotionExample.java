package javabasic_02.day11.inheritance.sec07.exam01;

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {


	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b; // 상속 관계이므로 b 객체변수에 저장된 주소값은 부모인 A 타입의 a1에 담을 수 있다.
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d;

		C c1 = e;

		// 내 자식이 아니면 자동 변환이 일어나지 않는다. 즉, 나의 부모타입으로만 자동변환된다. -> 상속관계가 아니기에 자동변환이 일어나지 않는다.


	}
}