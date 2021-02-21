package Pr6.AbstractFactory;

public class Factory2 implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new Product2();
    }
}
