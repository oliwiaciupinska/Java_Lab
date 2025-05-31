package Zadanie1;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity) {
        this.capacity = capacity;
        this.currentLevel = 0;
    }

    public void refuel(double amount) {
        if (currentLevel + amount > capacity) {
            currentLevel = capacity;
            System.out.println("Zbiornik pełny.");
        } else {
            currentLevel += amount;
            System.out.println("Zatankowano " + amount + "L. Obecny poziom: " + currentLevel + "L");
        }
    }

    public void consume(double amount) {
        if (amount > currentLevel) {
            System.out.println("Za mało paliwa. Obecny poziom: " + currentLevel + "L");
        } else {
            currentLevel -= amount;
            System.out.println("Zużyto " + amount + "L. Pozostało: " + currentLevel + "L");
        }
    }
}
