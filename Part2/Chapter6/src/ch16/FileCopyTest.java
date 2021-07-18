package ch16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {

    public static void main(String[] args) throws IOException {

        long millisecond = 0;

        try( FileInputStream fis = new FileInputStream("a.zip");
        FileOutputStream fos = new FileOutputStream("copy.zip")) {
            millisecond = System.currentTimeMillis();

            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다.");

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
            millisecond = System.currentTimeMillis();

            int i;
            while((i = bis.read()) != -1) {
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다.");

        Socket socket = new Socket();

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        br.readLine();
    }
}
