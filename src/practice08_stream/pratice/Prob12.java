package practice08_stream.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("/Users/hawon/Documents/study/Temp/numbers.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(10);
        dos.writeInt(20);
        dos.writeInt(30);

        dos.flush();
        dos.close();
        fos.close();


        FileInputStream fis = new FileInputStream("/Users/hawon/Documents/study/Temp/numbers.dat");
        DataInputStream dis = new DataInputStream(fis);

        for (int i=0; i<3; i++) {
            int numbers = dis.readInt();
            System.out.print(numbers + " ");
        }
        dis.close();
        fis.close();
    }
}
