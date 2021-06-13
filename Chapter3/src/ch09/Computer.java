package ch09;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    // 공통으로 쓸 메서드 구현
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("d전원을 끕니다.");
    }

}
