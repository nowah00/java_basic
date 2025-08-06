package javabagic_02.day11.inheritane.practice04;

public class SubFather extends GrandFather {
    void familyName(){
        System.out.println("나의 아버지는 프로그래머");
    }
    void houseAddress(){
        System.out.println("나의 집은 인천");
    }
    void printFather(){
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속박습니다.");
    }
}
