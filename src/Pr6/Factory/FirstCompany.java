package Pr6.Factory;

public class FirstCompany extends CarSharing{
    @Override
    protected Car booking(CarTypes type) {
        Car car=null;
        switch (type){
            case BMW:
                car =new FirstCompanyBmw();
                break;
            case MERCEDES:
                car=new FirstCompanyMercedes();
                break;
        }
        return car;
    }
}
