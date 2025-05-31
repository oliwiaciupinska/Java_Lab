package Zadanie1;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fuelTank, double loadCapacity) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Typ: Ciężarówka | Ładowność: " + loadCapacity + " ton");
    }
}
