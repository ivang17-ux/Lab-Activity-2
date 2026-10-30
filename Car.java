
public class Car extends Vehicle {

    private final int doorCount;

    public Car(String brand, String model, int year, int doorCount) {
        super(brand, model, year, 4);
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public void startEngine() {
        System.out.println(fullName()
                + " -> Car: the engine starts smoothly with a deep growl.");
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward.");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A car moves backwards.");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves to the left.");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves to the right.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car");
        System.out.println("Number of Doors: " + doorCount);
        System.out.println("Number of Wheels: " + getWheels());
    }
}
