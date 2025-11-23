package chef.command;

import chef.service.ChefService;
import chef.util.ConsoleReader;

public class RemoveVegetableCommand implements Command {

    private final ChefService service;

    public RemoveVegetableCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        if (!service.isSaladCreated()) {
            System.out.println("❗ Спочатку створіть салат.");
            return;
        }

        String name = ConsoleReader.readString("Назва овочу для видалення: ");
        service.removeVegetable(name);
        System.out.println("🗑️ Овоч видалено (якщо існував).");
    }

    @Override
    public String getName() {
        return "Видалити овоч";
    }
}