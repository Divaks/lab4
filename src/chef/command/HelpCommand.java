package src.chef.command;

public class HelpCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Довідка по програмі]");
    }

    @Override
    public String getName() {
        return "Довідка";
    }
}