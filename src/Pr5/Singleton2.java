package Pr5;

public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2(){
        System.out.println("Ленивая инициализация");
    }
    public static synchronized Singleton2 getInstance() {
        if(instance == null) {
            instance = new Singleton2();
            return instance;
        }
        return instance;
    }
}
