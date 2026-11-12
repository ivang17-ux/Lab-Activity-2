
public class Motorcycle extends Vehicle implements Serviceable {

    private int engineCapacity;

    public Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year, 2);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is moving on the road.");
    }

    @Override
    public void service() {
        System.out.println("Motorcycle: inspect tires and brakes.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}
