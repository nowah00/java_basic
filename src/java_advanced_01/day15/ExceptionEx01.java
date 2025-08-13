package java_advanced_01.day15;

public class ExceptionEx01 {
    public static void main(String[] args) {
        try {
            String[] array = {"100","lOO"};
            for (int i = 0; i < array.length; i++) {
                int s = Integer.parseInt(array[i]);
                System.out.println("변환된 숫자 : " + s);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        } catch (NumberFormatException e1){
            e1.getMessage();
        }

        System.out.println("프로그램 종료");

        // array 에서 값을 추출해서 숫자로 바꾸어 출력하려고 한다.
        // 해당 예외를 예측하려 예외처리를 하시오

//        for (int i = 0; i < array.length; i++) {
//            try {
//                int s = Integer.parseInt(array[i]);
//                System.out.println("변환된 숫자 : " + s);
//            } catch (NumberFormatException e) {
//                System.out.println("숫자를 입력해주세요.");
//            }
//        }
    }
}
