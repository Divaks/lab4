package chef.model;

import java.util.*;

public class Salad {
    private String name;
    private List<Vegetable> vegetables = new ArrayList<>();

    public Salad(String name) {
        this.name = name;
    }

    public void addVegetable(Vegetable v) {
        vegetables.add(v);
    }

    public void removeVegetable(String name) {
        vegetables.removeIf(v -> v.getName().equalsIgnoreCase(name));
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public double getTotalCalories() {
        return vegetables.stream().mapToDouble(Vegetable::getTotalCalories).sum();
    }

    public List<Vegetable> findByCalories(double min, double max) {
        return vegetables.stream()
                .filter(v -> v.getCaloriesPer100g() >= min && v.getCaloriesPer100g() <= max)
                .toList();
    }

    public void sortByName() {
        vegetables.sort(Comparator.comparing(Vegetable::getName));
    }

    public void sortByWeight() {
        vegetables.sort(Comparator.comparing(Vegetable::getWeight));
    }

    public void sortByCalories() {
        vegetables.sort(Comparator.comparing(Vegetable::getCaloriesPer100g));
    }

    @Override
    public String toString() {
        if (vegetables.isEmpty()) return "Салат порожній.";
        StringBuilder sb = new StringBuilder("Салат \"" + name + "\":\n");
        for (Vegetable v : vegetables) {
            sb.append(" - ").append(v).append("\n");
        }
        sb.append(String.format("Загальна калорійність: %.1f ккал%n", getTotalCalories()));
        return sb.toString();
    }
}