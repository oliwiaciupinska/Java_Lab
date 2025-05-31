package Zadanie1;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String brand, String model, int year, int maxSpeed, Engine engine, FuelTank fuelTank, int passengerCapacity) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Typ: Samochód osobowy | Miejsc: " + passengerCapacity);
    }
}
