package Pr8.ChainOfResponsibility;

public class EmailCheck implements Checkable {
    private Checkable checkable = null;
    @Override
    public void setNext(Checkable checkable) {
        this.checkable=checkable;
    }

    @Override
    public void check() {
        System.out.println("Email checked");
        if(checkable!=null) checkable.check();
    }
}
