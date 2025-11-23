package chef.command;

import chef.service.ChefService;
import chef.util.ConsoleReader;

public class SortVegetablesCommand implements Command {

    private final ChefService service;

    public SortVegetablesCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        if (!service.isSaladCreated()) {
            System.out.println("❗ Спочатку створіть салат.");
            return;
        }

        System.out.println("\nОберіть параметр сортування:");
        System.out.println("1. Назва");
        System.out.println("2. Вага");
        System.out.println("3. Калорії на 100г");

        int choice = ConsoleReader.readInt("Ваш вибір: ");

        switch (choice) {
            case 1 -> service.getSalad().sortByName();
            case 2 -> service.getSalad().sortByWeight();
            case 3 -> service.getSalad().sortByCalories();
            default -> {
                System.out.println("❌ Невідомий параметр.");
                return;
            }
        }

        System.out.println("🔃 Сортовано!");
        System.out.println(service.getSalad());
    }

    @Override
    public String getName() {
        return "Сортувати овочі";
    }
}