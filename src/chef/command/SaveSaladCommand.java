package src.chef.command;

public class SaveSaladCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Зберегти салат у файл]");
    }

    @Override
    public String getName() {
        return "Зберегти салат";
    }
}