package chef.command;

import chef.service.ChefService;

public class CalculateCaloriesCommand implements Command {

    private final ChefService service;

    public CalculateCaloriesCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        if (!service.isSaladCreated()) {
            System.out.println("❗ Спочатку створіть салат.");
            return;
        }

        double total = service.getSalad().getTotalCalories();
        System.out.printf("🔥 Загальна калорійність салату: %.1f ккал%n", total);
    }

    @Override
    public String getName() {
        return "Підрахувати калорійність";
    }
}