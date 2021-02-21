package Pr6.Factory;

public class SecondCompany extends CarSharing{
    @Override
    protected Car booking(CarTypes type) {
        Car car=null;
        switch (type){
            case BMW:
                car =new SecondCompanyBmw();
                break;
            case MERCEDES:
                car=new SecondCompanyMercedes();
                break;
        }
        return car;
    }
}
