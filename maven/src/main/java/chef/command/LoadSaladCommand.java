package chef.command;

import chef.service.ChefService;
import chef.util.ConsoleReader;

public class LoadSaladCommand implements Command {

    private final ChefService service;

    public LoadSaladCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        String file = ConsoleReader.readString("Ім'я файлу для завантаження: ");

        try {
            service.loadSalad(file);
        } catch (Exception e) {
            System.out.println("❌ Помилка читання: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "Завантажити салат";
    }
}