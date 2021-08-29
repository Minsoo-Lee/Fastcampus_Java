package ch02.Facade;

public class Writer {

    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect() {
        String msg = String.format("Writer %s로 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisConnect() {
        String msg = String.format("Writer %s로 연결을 종료합니다.", fileName);
        System.out.println(msg);

    }

    public void fileWrite() {
        String msg = String.format("Writer %s로 파일을 작성합니다.", fileName);
        System.out.println(msg);

    }
}
