package java08_stream.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//문제 : 학생 이름 "신세계" 나이 25 학점 3.8 을 student.dat파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob15 {
    public static void main(String[] args) throws Exception {

        Student student = new Student("신세계",25,3.8);

//        FileOutputStream fos = new FileOutputStream("/Users/hawon/Documents/study/Temp/student.dat");
//        DataOutputStream dos = new DataOutputStream(fos);
//
//        dos.writeUTF(student.getName());
//        dos.writeInt(student.getAge());
//        dos.writeDouble(student.getScore());
//
//        dos.flush();
//        dos.close();

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("/Users/hawon/Documents/study/Temp/student.dat"))){
            dos.writeUTF(student.getName());
            dos.writeInt(student.getAge());
            dos.writeDouble(student.getScore());
        }

        FileInputStream fis = new FileInputStream(("/Users/hawon/Documents/study/Temp/student.dat"));
        DataInputStream dis = new DataInputStream(fis);

        String name = dis.readUTF();
        int age = dis.readInt();
        double score = dis.readDouble();
        System.out.println("name: " + name + ", age: " + age + ", score: " + score);
    }
}
