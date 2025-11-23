package chef.command;

import chef.service.ChefService;
import chef.util.ConsoleReader;

public class SaveSaladCommand implements Command {

    private final ChefService service;

    public SaveSaladCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        if (!service.isSaladCreated()) {
            System.out.println("❗ Спочатку створіть салат.");
            return;
        }

        String file = ConsoleReader.readString("Ім'я файлу для збереження: ");

        try {
            service.saveSalad(file);
            System.out.println("💾 Салат збережено у файл \"" + file + "\".");
        } catch (Exception e) {
            System.out.println("❌ Помилка збереження: " + e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "Зберегти салат";
    }
}