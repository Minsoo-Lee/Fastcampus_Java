package ch11;

public class LoggerTest {
    public static void main(String[] args) {
        MyLogger mylogger = MyLogger.getLogger();
        mylogger.log("Log Test");
    }
}
