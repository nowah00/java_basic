package javabagic_02.day10.morningtest;

public class ShopService {
        // 싱글톤 클래스 객체를 담을 인스턴스 변수
        private static ShopService instance;

        // 생성자를 private 선언 (외부에서 new 못하게)
        private ShopService(){}

        public static ShopService getInstance(){
                if(instance == null){
                        instance = new ShopService();
                }
                return instance;
        }

        public static void main(String[] args) {
                ShopService obj1 = ShopService.getInstance();
                ShopService obj2 = ShopService.getInstance();

                if(obj1 == obj2){
                        System.out.println("같은 ShopService 객체입니다.");
                } else{
                        System.out.println("다른 ShopService 객체입니다.");
                }
        }
}
