package java08_stream.pratice;

import java.io.*;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20} dmf array.dat에 저장한 후 다시 읽어 합계와 평균을 구하고 평균을 기준으로 정렬하여 콘솔에 출력하세요
public class Prob14_O {
    public static void main(String[] args) throws Exception {

        //1.정수 배열 {5,10,15,20} --> resource  저장 파일의 이름 지정
        int[] array = {5,10,15,20};
        String fileName = "/Users/hawon/Documents/study/Temp/array.dat";

        //2.배열을 파일에 저장 로직 구현
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(array.length); //배열의 길이를 먼저 저장
            for (int i = 0; i < array.length; i++) {
                dos.writeInt(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } //-> 자동 close 가 됌

        //3.저장한 파일에서 배열 읽기 로직 구현
        int[] readArray = null;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            int length = dis.readInt();
            readArray = new int[length];
            for (int i = 0; i < length; i++) {
                readArray[i] = dis.readInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //4.배열에서 값을 요소를 모두 더하여 합계를 구하고 평균을 구한다.
        if (readArray != null) {
            int sum=0;
            for (int i : readArray) sum += i;
            double avg = sum/readArray.length;

            System.out.println("읽어온 배열" + Arrays.toString(readArray));
            System.out.println("합계 " + sum);
            System.out.println("평균 " + avg);
        }
    }
}
