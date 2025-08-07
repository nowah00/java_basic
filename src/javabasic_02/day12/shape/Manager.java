package javabasic_02.day12.shape;

public class Manager {
    // 사각형, 삼각형, 원 클래스는 서로 다른 타입이어서 각각 타입을 정의해서 같은 타입끼리 묶어서 관리
    public static void main(String[] args) {
        Square[] square = new Square[4];
        square[0] = new Square();
        square[1] = new Square();
        square[2] = new Square();
        square[3] = new Square();

        Triangle[] triangle = new Triangle[5];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new Triangle();
        }

        Circle[] circle = new Circle[3];
        for (int i = 0; i < circle.length; i++) {
            circle[i] = new Circle();

        }

        Shape[] shape = new Shape[4];
        shape[0] = square[0];
        shape[1] = square[1];
        shape[2] = triangle[2];
        shape[3] = circle[2];

        Circle circle1 = (Circle) shape[3];
    }
}
// 하나의 자료형 shape 으로 관리하니 코드량도 적어지고 가독성도 좋아지고 유지보수성도 좋아짐.
// 자식클래스에서만 있는 고유 메서드를 실행하려면 업캐스팅한 객체를 다시 자식클래스로 다운캐스팅 해주어야한다.
