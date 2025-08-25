package java_advanced.day20.pratice;

import java.io.FileReader;
import java.io.Reader;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) throws Exception {
        Reader reader = null;

        reader = new FileReader("/Users/hawon/Documents/Temp/hello.txt");
        int count = 0;
        while (true){
            int read = reader.read();
            if (read == -1) break;
            count++;
        }
        System.out.println(count);
        reader.close();
    }
}
