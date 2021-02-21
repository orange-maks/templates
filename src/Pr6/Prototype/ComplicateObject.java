package Pr6.Prototype;

public class ComplicateObject implements Copyable{
    Type type;
    public enum Type{
        ONE,TWO
    }
    @Override
    public ComplicateObject copy() {
        return new ComplicateObject();
    }
    public void setType(Type type){
        this.type=type;
    }
}
