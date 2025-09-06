package java_advanced_01.day21.practice;

import java.io.*;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) throws IOException {
        String originalImage = "C:/practice/image.jpg";
        String newImage = "C:/practice/copy.jpg";

        InputStream is = new FileInputStream(originalImage);
        OutputStream os = new FileOutputStream(newImage);

        is.transferTo(os);
        os.flush();
        is.close();
        os.close();
    }
}
