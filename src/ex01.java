public class ex01 {
// 접근제한자
//  - public > protected > default(아무것도 없을땐 디폴트 클래스) > private

    public static void main(String[] args) {
//- main 메소드
//- 메소드: 기능단위
//- static: 수행이 끝날때까지 클래스를 유지시켜줘야한다
        // 3개의 정수를 10,11,12를 더하여 결과를 출력하세요.
        int num1, num2, num3, sum;   //정수형 변수 선언
        num1 = 10;
        num2 = 11;
        num3 = 12;

        //연산
        sum = num1 + num2 + num3;

        //출력
        System.out.println("10+11+12 = " + sum);
        System.out.println(num1 + "+" + num2 + "+" + num3 + "+" + sum);
            // + -> 연결연산자, num1 -> 변수, "" -> 문자열
        System.out.printf(" %d + %d + %d = %d " ,num1,num2,num3,sum);
            // %d는 , 뒤에 있는 수들을 순서대로 꽂아서 연산하라는 용어


    }

}



