package javabasic_02.Day08.String;

// 똑같은 변수 a의 주소값을 출력하였다.
// 문자열이 변경됨에 따라 주소값이 바뀌어 이음을 확인
// 즉, 문자열 값 자체는 불변이라 변경할 수 없기 때문에 새로운 문자데이터 객테를 대입하여 새로운 공간에 값이 할당됨울 할 수 있다.

public class RefEx02 {
    public static void main(String[] args) {
       String a = "Hello";
        System.out.println(a.hashCode());   //-> 69609650

       a += "Java Programing";
        System.out.println(a.hashCode());   //-> -1951018838 => 위 해시코드와 다르다.
        // 문자열은 String 타입으로 받는데 수정을 불가하다. 새로운 공간에 초기값을 입력했다.
        // 수정을 한다고 하면 기존 공간에 하는 것이 아니라 새로운 공간에 새로운 파일을 생성하는 것.
        System.out.println(a);

    }
}
