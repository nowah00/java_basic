package Day03;

public class OperationEx01 {
    public static void main(String[] args) {
        // 부호 연산 : 변수의 부호를 유지하거나 변경한다
        byte b = 100;
        System.out.println(b);

        b = 100; //앞에 타입 안쓰면 재활용

        // 정수 타입 (byte, short, int)의 연산결과는 int 타입으로 저장해야한다
        int a = -b;
        System.out.println(a);

        int c = -a;
        System.out.println(c);

        // 증감연산자 : 변수의 값을 1 증가시키거나 1 감소시킬 때 사용
        // ++x, --x prefix
        // x++, x-- postfix

        // ++x, x++     => i = i + 1
        // --x, x--     => i = i - 1

        int x = 1;
        int y = 1;

        int result1 = ++x + 10;      // (x= x=1) + 10 = 12
        System.out.println(result1);

        int result2 = y++ + 10;
        System.out.println(result2);

        System.out.println(y++ + 10);

        int x1 = 10;
        int y1 = 10;
        int z;

        x1++;       // x1 = x1 = 1
        ++x1;       // x1 = x1 = 1
        System.out.println("x1 : " + x1);

        System.out.println("=====================");

        y1--;       // y1 = y1 - 1
        --y1;       // y1 = y1 - 1
        System.out.println("y1 : " + y1);

        System.out.println("=====================");

        z = x1++;
        System.out.println("z : " + z + " x1 : " + x1);

        System.out.println("=====================");

        z = ++x1 + y1++;
        System.out.println("z : " + z + " y1 : " + y1);

    







    }
}
