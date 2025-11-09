package src.chef.command;

public class RemoveVegetableCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Видалити овоч]");
    }

    @Override
    public String getName() {
        return "Видалити овоч";
    }
}