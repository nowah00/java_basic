package java_advanced.day17.AnonymousCLass.class3;
class Animal {
    public String eat(){
        return "맛있게 먹습니다.";
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(){
            @Override
            public String eat() {
                String run = run();
                return "강아지가 냠냠 먹습니다."+ " " + run;
            }
            public String run(){
                return "강아지가 달립니다.";
            }
        };
        String eat = dog.eat();
//        dog.run();

        System.out.println(eat);
    }
}
//새로 정의한 메소드는 외부 스코프에서는 호출될 수 없고, 익명클래서 내에서만 호출 가능하다.
