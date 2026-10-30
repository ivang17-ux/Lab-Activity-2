
public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    private int wheels;

    public Vehicle(String brand, String model, int year, int wheels) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;

        if (year >= 1886 && year <= 2026) {
            this.year = year;
        } else {
            this.year = 2026;
        }
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getWheels() {
        return wheels;
    }

    // Setter
    public boolean setYear(int year) {
        if (year >= 1886 && year <= 2026) {
            this.year = year;
            return true;
        }

        return false;
    }

    // Calculate age
    public int calculateAge() {
        return 2026 - year;
    }

    // Check vintage
    public boolean isVintage() {
        return calculateAge() > 25;
    }

    // Full name
    public String fullName() {
        return brand + " " + model;
    }

    // Display information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Start engine
    public void startEngine() {
        System.out.println(fullName() + " engine started.");
    }

    // Abstract movement methods
    public abstract void moveForward();

    public abstract void moveBackwards();

    public abstract void moveLeft();

    public abstract void moveRight();
}
