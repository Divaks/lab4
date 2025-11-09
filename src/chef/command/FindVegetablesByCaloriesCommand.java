package src.chef.command;

public class FindVegetablesByCaloriesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Знайти овочі за калорійністю]");
    }

    @Override
    public String getName() {
        return "Знайти овочі за калорійністю";
    }
}