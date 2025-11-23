package chef.command;

import chef.model.*;
import chef.service.ChefService;
import chef.util.ConsoleReader;

public class AddVegetableCommand implements Command {

    private final ChefService service;

    public AddVegetableCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        if (!service.isSaladCreated()) {
            System.out.println("❗ Спочатку створіть салат.");
            return;
        }

        System.out.println("\nОберіть тип овочу:");
        System.out.println("1. Листковий");
        System.out.println("2. Коренеплід");
        System.out.println("3. Плодове овоче");

        int type = ConsoleReader.readInt("Ваш вибір: ");

        String name = ConsoleReader.readString("Назва овочу: ");
        double weight = ConsoleReader.readDouble("Вага (грам): ");
        double calories = ConsoleReader.readDouble("Ккал на 100г: ");

        Vegetable v;

        switch (type) {
            case 1 -> v = new LeafyVegetable(name, weight, calories);
            case 2 -> v = new RootVegetable(name, weight, calories);
            case 3 -> v = new FruitVegetable(name, weight, calories);
            default -> {
                System.out.println("❌ Невідомий тип.");
                return;
            }
        }

        service.addVegetable(v);
        System.out.println("✅ Овоч додано!");
    }

    @Override
    public String getName() {
        return "Додати овоч";
    }
}