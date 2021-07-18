package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;

//        try {
//            fis = new FileInputStream("a.txt");
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//            try {
//                fis.close();
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//            }
//        }
        try {
            fis = new FileInputStream("a.txt");
            System.out.println("read");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally");
        }

        System.out.println("end");
    }
}
