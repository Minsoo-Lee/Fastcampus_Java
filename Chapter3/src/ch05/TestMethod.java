package ch05;

public class TestMethod {
    static int num = 0;

    void aaa() {
        System.out.println("aaa() 호출" + num);
        num++;
    }

    public static void main(String[] args) {
        TestMethod a1 = new TestMethod();
        a1.aaa();

        TestMethod a2 = new TestMethod();
        a2.aaa();
    }
}
