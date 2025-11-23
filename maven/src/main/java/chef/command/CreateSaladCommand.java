package chef.command;

import chef.service.ChefService;
import chef.util.ConsoleReader;

public class CreateSaladCommand implements Command {
    private final ChefService service;

    public CreateSaladCommand(ChefService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        String name = ConsoleReader.readString("Введіть назву салату: ");
        service.createSalad(name);
        System.out.println("✅ Салат \"" + name + "\" створено!");
    }

    @Override
    public String getName() {
        return "Створити салат";
    }
}