package chef.model;

public abstract class Vegetable {
    private String name;
    private double weight;
    private double calories;

    public Vegetable(String name, double weight, double calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCaloriesPer100g() {
        return calories;
    }

    public double getTotalCalories() {
        return (weight / 100) * calories;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0f г, %.1f ккал)", name, weight, getTotalCalories());
    }
}