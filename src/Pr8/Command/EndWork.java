package Pr8.Command;

public class EndWork implements Command {
    Factory factory;

    public EndWork(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void execute() {
        factory.endWorkFactory();
    }
}
