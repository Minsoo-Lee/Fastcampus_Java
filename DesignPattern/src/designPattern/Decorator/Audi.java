package ch02.Decorator;

public class Audi implements ICar {
    
    private int price;
    
    public Audi(int cost) {
        this.price = cost;
    }
    
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("Audi의 가격은 " + this.price + "원 입니다.");
    }
}