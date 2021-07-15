package ch08;

public class PracticeTest {
    public static void main(String[] args) {
        Person person = new Person("Thomas", 37, 180, 78, "남성");

        person.show();

        System.out.println();

        Order order = new Order ("202011020003", "01023450001", "서울시 강남구 역삼동 " +
                "111-333", "20201102", "130258", 35000, "0003");

        order.show();
    }
}
