package java_advanced.day15.generic;

public class Box {
    //Box 에 넣을 내용물을 content 필드 선언
    //Object 타입은 모든 클래스의 슈퍼(부모)클래스이므로 프로모션이 된다.
    //모든 객체는 부모타입이 Object 로 자동타입변환된다.
    //content 는 어떤 객체든 대입 가능하다.

    public Object content;

    public static void main(String[] args) {
        Box box = new Box();
        box.content = "바비인형";
//        box.content = 100;
//        box.content = 3.14;
        //문제는 박스 안에 내용물을 얻어낼 떄 발생한다.
        //content 필드는 Object 타입이므로 어떤 객체가 대입되어 있는지 확실하게 알 수 없다.
        String doll = (String) box.content;
        //어떤 내용물이 저장되었는지 모른다면 instanceof 를 이용하여 타입조사를 할 수 있지만,
        //모든 타입을 조사할 수 없다.



    }
}
