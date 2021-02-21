package Pr5;

public enum Singleton3 {
    instance;
    public Singleton3 getInstance(){
        System.out.println("Перечисление");
        return instance;
    }
}
