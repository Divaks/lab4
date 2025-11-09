package src.chef;

import src.chef.command.*;
import java.util.*;

public class ChefApplication {

    private final Map<Integer, Command> commands = new LinkedHashMap<>();

    public ChefApplication() {
        commands.put(1, new CreateSaladCommand());
        commands.put(2, new AddVegetableCommand());
        commands.put(3, new RemoveVegetableCommand());
        commands.put(4, new SortVegetablesCommand());
        commands.put(5, new CalculateCaloriesCommand());
        commands.put(6, new FindVegetablesByCaloriesCommand());
        commands.put(7, new SaveSaladCommand());
        commands.put(8, new LoadSaladCommand());
        commands.put(9, new HelpCommand());
        commands.put(0, new ExitCommand());
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Меню Шеф-повара ===");
            for (Map.Entry<Integer, Command> entry : commands.entrySet()) {
                System.out.printf("%d. %s%n", entry.getKey(), entry.getValue().getName());
            }
            System.out.print("Оберіть дію: ");

            int choice = scanner.nextInt();
            Command command = commands.get(choice);
            if (command != null) {
                command.execute();
            } else {
                System.out.println("❌ Невірний вибір. Спробуйте ще раз.");
            }
        }
    }

    public static void main(String[] args) {
        new ChefApplication().run();
    }
}