package chef.service;

import chef.model.*;
import java.io.*;

public class ChefService {
    private Salad currentSalad;

    public void createSalad(String name) {
        currentSalad = new Salad(name);
    }

    public Salad getSalad() {
        return currentSalad;
    }

    public boolean isSaladCreated() {
        return currentSalad != null;
    }

    public void addVegetable(Vegetable v) {
        currentSalad.addVegetable(v);
    }

    public void removeVegetable(String name) {
        currentSalad.removeVegetable(name);
    }

    public void saveSalad(String filename) throws IOException {
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println(currentSalad.toString());
        }
    }

    public void loadSalad(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\nВміст файлу:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}