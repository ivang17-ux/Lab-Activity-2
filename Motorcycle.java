public class Motorcycle extends Vehicle {
    private final int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year, 3);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName()
                + " -> Motorcycle: the engine starts with a powerful roar.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle | Engine Capacity: "
                + engineCapacity + " cc");
        System.out.println("Number of Wheels: 3");
    }
}