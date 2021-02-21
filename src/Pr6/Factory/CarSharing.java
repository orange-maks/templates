package Pr6.Factory;

public abstract class CarSharing {
    public Car test(CarTypes type){
        Car car= booking(type);
        car.start();
        car.go();
        System.out.println("Машина уехала");
        return car;
    }
    protected abstract Car booking(CarTypes type);
}
