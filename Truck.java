
public class Truck extends Vehicle implements Serviceable {

    private double cargoCapacityTons;

    public Truck(String brand, String model, int year, double cargoCapacityTons) {
        super(brand, model, year, 8);
        this.cargoCapacityTons = cargoCapacityTons;
    }

    @Override
    public void move() {
        System.out.println("Truck is transporting cargo.");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cargo Capacity: " + cargoCapacityTons + " tons");
    }
}
    