package Pr6.AbstractFactory;

public class Factory1 implements AbstractFactory {
    @Override
    public Product createProduct() {
        return new Product1();
    }
}
