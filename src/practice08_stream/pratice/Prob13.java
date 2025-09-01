package practice08_stream.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("/Users/hawon/Documents/study/Temp/data.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(100);
        dos.writeDouble(3.14);
        dos.writeUTF("Java");
        dos.writeBoolean(Boolean.TRUE);
        dos.flush();
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(("/Users/hawon/Documents/study/Temp/data.dat"));
        DataInputStream dis = new DataInputStream(fis);

        for (int i=0; i<1; i++) {
            int a = dis.readInt();
            double b = dis.readDouble();
            String c = dis.readUTF();
            boolean d = dis.readBoolean();
            System.out.println(a + " " + b + " " + c + " " + d);
        }
        dis.close();
        fis.close();
    }
}
