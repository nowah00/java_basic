package java_advanced.day20.pratice;

import java.io.FileReader;
import java.io.Reader;

// 문제 2: 텍스트 파일에 저장된 문자열 읽기
//         hello.txt 파일을 읽어 화면에 출력하세요.
public class Prob2 {

    public static void main(String[] args) throws Exception {
        Reader reader = null;

        reader = new FileReader("/Users/hawon/Documents/Temp/hello.txt");

        while (true) {
            int read = reader.read();
            if (read == -1) break;
            System.out.print((char) read);
        }
        reader.close();
    }
}
