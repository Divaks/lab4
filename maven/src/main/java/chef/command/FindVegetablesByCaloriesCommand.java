package chef.command;

import chef.model.Vegetable;
import chef.service.ChefService;
import chef.util.ConsoleReader;

import java.util.List;

public class FindVegetablesByCaloriesCommand implements Command {

    private final ChefService service;

    public FindVegetablesByCaloriesCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        if (!service.isSaladCreated()) {
            System.out.println("❗ Спочатку створіть салат.");
            return;
        }

        double min = ConsoleReader.readDouble("Мінімальні ккал на 100г: ");
        double max = ConsoleReader.readDouble("Максимальні ккал на 100г: ");

        List<Vegetable> list = service.getSalad().findByCalories(min, max);

        if (list.isEmpty()) {
            System.out.println("🚫 Нічого не знайдено.");
            return;
        }

        System.out.println("\n🔎 Знайдені овочі:");
        list.forEach(v -> System.out.println(" - " + v));
    }

    @Override
    public String getName() {
        return "Знайти овочі за калорійністю";
    }
}