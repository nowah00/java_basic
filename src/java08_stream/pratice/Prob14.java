package java08_stream.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 정수 배열 {5,10,15,20} dmf array.dat에 저장한 후 다시 읽어 합계와 평균을 구하고 평균을 기준으로 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("/Users/hawon/Documents/study/Temp/array.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        byte[] num = {5,10,15,20};
        dos.write(num);
        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(("/Users/hawon/Documents/study/Temp/array.dat"));
        DataInputStream dis = new DataInputStream(fis);

        int sum = 0;

        for (int i=0; i<num.length; i++) {
            num[i] = dis.readByte();
            sum += num[i];
        }
        double avg = (double) sum / num.length;
        System.out.println("합계: " + sum + " 평균: " + avg);
    }
}
