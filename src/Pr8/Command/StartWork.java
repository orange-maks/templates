package Pr8.Command;

public class StartWork implements Command {
    Factory factory;

    public StartWork(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void execute() {
        factory.startWorkFactory();
    }
}
