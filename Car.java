public class Car extends Vehicle {
    String fuelType;

    // Constructor initializing all fields including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Calls the constructor of the base class
        this.fuelType = fuelType;
    }

    // Overriding displayDetails to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls the base class display method
        System.out.println("Fuel Type: " + fuelType);
    }
}