package java_advanced_01.day21.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriterEx01 {
    public static void main(String[] args) throws IOException {
        try {
            // 출력 스트림 생성
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");
            // 내보낼 데이터 지정
            byte[] arr = {10, 20, 30};
            // 데이터를 스트림에 보내서 해당 목적지에 쓴다.
            os.write(arr);
            // 스트림의 버퍼를 지운다.
            os.flush();
            // 스트림을 닫는다.
            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
