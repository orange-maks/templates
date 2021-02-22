package Pr7.Adapter;

public class Main {
    public static void main(String[] args) {
        Train train=new Train(new CarAdapter());
        train.GoOnRailway();
    }
}
