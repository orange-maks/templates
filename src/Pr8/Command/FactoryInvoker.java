package Pr8.Command;

public class FactoryInvoker {
    public Command command;

    public FactoryInvoker(Command command) {
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
