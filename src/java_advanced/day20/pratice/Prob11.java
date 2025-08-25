package java_advanced.day20.pratice;

import java_advanced.day13.B;

import java.io.*;

// 문제 11: 간단한 메모장 (덮어쓰기 모드 vs 이어쓰기 모드)
//       사용자가 입력한 내용을 memo.txt에 저장하는 프로그램을 작성하세요.
//       "append" 모드를 선택하면 기존 내용 뒤에 이어쓰기,
//       "overwrite" 모드를 선택하면 새로 쓰기 기능을 수행합니다.
public class Prob11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mode = br.readLine();

        boolean append = mode.equalsIgnoreCase("append");

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/hawon/Documents/Temp/memo.txt", append));

        System.out.println();
        String line;
        while (!(line = br.readLine()).equals("exit")) {
            bw.write(line);
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();


    }
}
