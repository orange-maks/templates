package Pr8.ChainOfResponsibility;

public class PassCheck implements Checkable {
    private Checkable checkable=null;
    @Override
    public void setNext(Checkable checkable) {
        this.checkable=checkable;
    }

    @Override
    public void check() {
        System.out.println("Password checked");
        if(checkable!=null) checkable.check();
    }
}
