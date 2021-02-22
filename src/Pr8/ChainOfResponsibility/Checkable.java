package Pr8.ChainOfResponsibility;

public interface Checkable {
    void setNext(Checkable checkable);
    void check();
}
