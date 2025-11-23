package chef;

import chef.command.*;
import chef.service.ChefService;
import java.util.*;

public class ChefApplication {

    private final Map<Integer, Command> commands = new LinkedHashMap<>();

    public ChefApplication() {
        ChefService service = new ChefService();

        commands.put(1, new CreateSaladCommand(service));
        commands.put(2, new AddVegetableCommand(service));
        commands.put(3, new RemoveVegetableCommand(service));
        commands.put(4, new SortVegetablesCommand(service));
        commands.put(5, new CalculateCaloriesCommand(service));
        commands.put(6, new FindVegetablesByCaloriesCommand(service));
        commands.put(7, new SaveSaladCommand(service));
        commands.put(8, new LoadSaladCommand(service));
        commands.put(9, new HelpCommand());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Меню Шеф-повара ===");
            for (Map.Entry<Integer, Command> entry : commands.entrySet()) {
                System.out.printf("%d. %s%n", entry.getKey(), entry.getValue().getName());
            }
            System.out.println("0. Вихід");
            System.out.print("Оберіть дію: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) break;

            Command command = commands.get(choice);
            if (command != null) command.execute();
            else System.out.println("❌ Невірний вибір. Спробуйте ще раз.");
        }
    }

    public static void main(String[] args) {
        new ChefApplication().run();
    }
}