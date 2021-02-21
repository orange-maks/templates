package Pr6.Factory;

public class Main {
    public static void main(String[] args) {
        CarSharing first =new FirstCompany();
        first.test(CarTypes.BMW);

        CarSharing second = new SecondCompany();
        second.test(CarTypes.BMW);
    }
}
