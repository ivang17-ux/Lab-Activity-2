
public class Truck extends Vehicle {

    private final double cargoCapacityTons;

    public Truck(String brand, String model, int year, double cargoCapacityTons) {
        super(brand, model, year, 8);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    public double getCargoCapacityTons() {
        return cargoCapacityTons;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName()
                + " -> Truck: the powerful engine starts with a loud roar.");
    }

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A truck moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves to the left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves to the right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck");
        System.out.println("Cargo Capacity: " + cargoCapacityTons + " tons");
        System.out.println("Number of Wheels: " + getWheels());
    }
}
