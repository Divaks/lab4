package src.chef.command;

public class LoadSaladCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Завантажити салат з файлу]");
    }

    @Override
    public String getName() {
        return "Завантажити салат";
    }
}