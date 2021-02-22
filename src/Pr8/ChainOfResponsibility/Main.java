package Pr8.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Checkable emailCheck = new EmailCheck();
        Checkable passCheck = new PassCheck();
        emailCheck.setNext(passCheck);
        emailCheck.check();
    }
}
