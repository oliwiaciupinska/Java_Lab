package Zadanie1;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected int maxSpeed;
    protected Engine engine;
    protected FuelTank fuelTank;

    public Vehicle(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fuelTank) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public void displayInfo() {
        System.out.println("Pojazd: " + brand + " " + model + " (" + year + ")");
        System.out.println("Maks. prędkość: " + maxSpeed + " km/h");
    }
}
