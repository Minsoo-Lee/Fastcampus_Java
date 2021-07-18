package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

    public static void main(String[] args) {
        System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");

        int i;

        try {
            InputStreamReader irs = new InputStreamReader(System.in);
            // 한글을 써야 할 때는 이 구문 사용
            while ((i = irs.read()) != '\n') {
                // i = System.in.read()는 한글을 인식하지 못함
//                System.out.println(i);
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
