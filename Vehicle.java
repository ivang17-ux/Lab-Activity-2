
public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    private int wheels;

    public Vehicle(String brand, String model, int year, int wheels) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
    }

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

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Wheels: " + wheels);
    }

    public abstract void move();
}
