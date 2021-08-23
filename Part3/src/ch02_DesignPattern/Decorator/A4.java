package ch02_DesignPattern.Decorator;

public class A4 extends AudiDecorator {
    public A4(ICar audi, String modelName) {
        super(audi, modelName, 2000);
    }
}