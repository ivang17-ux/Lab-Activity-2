public class Vehicle {
    String brand;
    String model;
    int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Calculate vehicle age
    public int calculateAge() {
        return 2026 - year;
    }

    // Check if vehicle is vintage
    public boolean isVintage() {
        return calculateAge() > 25;
    }

    // Display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}