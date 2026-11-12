
public class Car extends Vehicle implements Serviceable {

    private int doorCount;

    public Car(String brand, String model, int year, int doorCount) {
        super(brand, model, year, 4);
        this.doorCount = doorCount;
    }

    @Override
    public void move() {
        System.out.println("Car is driving on the road.");
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doorCount);
    }
}
