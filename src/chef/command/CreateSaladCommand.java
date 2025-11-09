package src.chef.command;

public class CreateSaladCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Створення нового салату]");
    }

    @Override
    public String getName() {
        return "Створити салат";
    }
}