package java_advanced.day20.outstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx03 {
    public static void main(String[] args) {

        try {
            //1.출력스트림 생성한다. -> C:Temp/test1.db에 1byte 씩 저장
            OutputStream os = new FileOutputStream("/Users/hawon/Documents/Temp/test3.db"); //데이터 도착지를 test2.db 바이트 출력 스트림 생성

            //2.내보낼 데이터를 지정한다.
            byte[] array = {10,20,30,40,50};

            //3.데이터를 스트림에 보내서 해당 목적지에 쓴다. -> 배열의 인덱스 1부터 3개 즉, 20,30,40을 출력
            os.write(array,1,3);

            //4.스트림의 버퍼를 비운다. (내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움)
            os.flush();

            //5.스트림을 닫는다.
            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
