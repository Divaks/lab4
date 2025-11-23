package chef.command;

public class HelpCommand implements Command {

    @Override
    public void execute() {
        System.out.println("\nДовідка:");
        System.out.println("Програма \"Шеф-повар\" дозволяє створювати салати з різних овочів,");
        System.out.println("обчислювати калорійність, сортувати, зберігати і завантажувати їх.");
    }

    @Override
    public String getName() {
        return "Довідка";
    }
}