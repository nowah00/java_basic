package java_advanced.day20.fileinoutstream;

import java.io.*;

//파일 복사 기능 : FileInputStream 읽은 바이트를 바로 FileOutStream 으로 출력기
public class CopyEx {
    public static void main(String[] args) throws IOException {
        String originalFileName = "/Users/hawon/Documents/Temp/test.jpg";
        String newFileName = "/Users/hawon/Documents/Temp/testCopy.jpg";

        //InputStream, OutputStream 객체 생성 -> 파일을 대상으로 입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);

        /*//이미지 객체의 데이터를 바이트 읽는다.
        byte[] buffer = new byte[is.available()]; //읽은 바이트 수만큼 저장할 저장소 생성
        while(true) {
            int numRead = is.read(buffer);
            if (numRead == -1) break;
            os.write(buffer, 0, numRead);
        }*/
        //java9 부터 입력스트림에서 출력스트림으로 바이트를 복사하는 메소드 제공 transferTo()
        is.transferTo(os);

        //내부 버퍼 비우기
        os.flush();

        //스트림 모두 닫기
        is.close();
        os.close();
    }

}
