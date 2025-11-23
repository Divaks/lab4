package chef.command;

public class ExitCommand implements Command {

    @Override
    public void execute() {
        System.out.println("👋 Завершення роботи...");
        System.exit(0);
    }

    @Override
    public String getName() {
        return "Вихід";
    }
}