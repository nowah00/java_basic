package java10_serialize;
//자바는 메모리에 생성된 객체를 파일 또는 네트워트로 출력할 수 있다.
//객체를 입출력할 수 있는 보조 스트림
//-> ObjectInputStream(바이트 스트림과 연결되어 객체로 복원하는 역직렬화)
//-> ObjectOutputStream(바이트 스트림과 연결되어 객체로 복원하는 직렬화)

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;
import java.util.Arrays;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private transient int age; //transient 키워드는 직렬화 대상에서 필드를 제외한다.
    private static int count = 0; //static 필드도 직렬화 대상에서 제외된다.
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int price;
}

public class ObjectInOutEx {
    public static void main(String[] args) throws Exception {
        //1./Users/hawon/Documents/study/Temp/object.dat 에 파일입력 객체를 생성해 주세요.
        String fileName = "/Users/hawon/Documents/study/Temp/object.dat";

        FileOutputStream fos = new FileOutputStream(fileName);

        //2.생성된 파일입력스트림 객체에 객체 출력스트림 객체를 끼워(연결)주세요.
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //3.객체 생성
        User user = new User("신세계",20);
        Product product = new Product("삼성노트북",1500000);
        int[] arr1 = {10,20,30};
        List<Product> products = Arrays.asList(product);

        //4.위 4개의 객체를 object.dat 파일에 저장
        oos.writeObject(user);
        oos.writeObject(product);
        oos.writeObject(arr1);
        oos.writeObject(products);

        //5.
        oos.flush();
        fos.flush();
        oos.close();
        fos.close();

        //6.파일에서 읽어서 ObjectInputStream
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            while(true){
                Object obj = ois.readObject();
                if (obj instanceof int[]) {
                    System.out.println(Arrays.toString((int[])obj));
                } else System.out.println(obj);
            }
        } catch (EOFException e) { //파일 끝 예외처리
            System.out.println("파일 끝");
        }
    }
}
