
public class Motorcycle extends Vehicle {

    private final int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year, 2);
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
    public void moveForward() {
        System.out.println("A motorcycle moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A motorcycle moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves to the left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves to the right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Number of Wheels: " + getWheels());
    }
}
