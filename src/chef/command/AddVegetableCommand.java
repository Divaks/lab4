package src.chef.command;

public class AddVegetableCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Додати овоч]");
    }

    @Override
    public String getName() {
        return "Додати овоч";
    }
}