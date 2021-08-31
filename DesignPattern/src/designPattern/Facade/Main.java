package ch02.Facade;

public class Main {
    public static void main(String[] args) {
        FTP ftpClient = new FTP("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("txt.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisConnect();
        ftpClient.disConnect();

        // SFTP Client 사용
        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "txt.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
