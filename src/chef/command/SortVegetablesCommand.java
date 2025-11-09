package src.chef.command;

public class SortVegetablesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Сортувати овочі]");
    }

    @Override
    public String getName() {
        return "Сортувати овочі";
    }
}