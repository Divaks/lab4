package src.chef.command;

public class CalculateCaloriesCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-> [Підрахувати калорійність салату]");
    }

    @Override
    public String getName() {
        return "Підрахувати калорійність";
    }
}