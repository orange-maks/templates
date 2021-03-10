package Pr6.Prototype;

public class Main {
    public static void main(String[] args) {
        ComplicateObject prototype = new ComplicateObject();
        ComplicateObject clone = prototype.copy();
        clone.setType(ComplicateObject.Type.ONE);
    }
}
