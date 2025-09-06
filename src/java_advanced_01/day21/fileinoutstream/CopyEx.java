package java_advanced_01.day21.fileinoutstream;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) throws IOException {
        String originalFileName = "C:/Temp/test.jpg";
        String newFileName = "C:/Temp/testGood.jpg";

        // InputStream, OutputStream 객체 생성
        // => 파일을 대상으로 입출력 스트림 생성
        InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(newFileName);

        // 이미지 객체의 데이터를 바이트로 읽는다
//        byte[] buffer = new byte[1024];
//        while (true) {
//            int numRead = is.read(buffer);
//            if (is.read(buffer) != -1) break;
//            os.write(buffer, 0, numRead);
//        }
        // java9부터 입력스트림에서 출력스트림으로 바이트를 복사하는 메서드 제공
        is.transferTo(os);

        // 내부 비우기
        os.flush();
        // 스트림 닫기
        os.close();
        is.close();
    }
}
