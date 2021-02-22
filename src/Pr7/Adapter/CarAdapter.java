package Pr7.Adapter;

public class CarAdapter implements GoAsTrain{
    private Car car;
    public CarAdapter(){
        car=new Car();
    }
    @Override
    public void start() {
        car.goByCar();
    }
}
