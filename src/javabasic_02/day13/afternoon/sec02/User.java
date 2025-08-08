package javabasic_02.day13.afternoon.sec02;
// 이 기능으로 예를들어 구독 서비스를 가입했을 때 요금제에 따라 인터페이스 A, B, C 로 나누어 사용자를 구분 지을 수 있다.
public class User {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();

        InterfaceA ia = impl;
        ia.methodA();

        InterfaceB ib = impl;
        ib.methodB();

        InterfaceC ic = impl; // InterfaceA, B 를 C가 상속하기에 모든 메소드 사용 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
