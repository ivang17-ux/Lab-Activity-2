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
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car | Number of Doors: "
                + doorCount);
        System.out.println("Number of Wheels: 4");
    }
}