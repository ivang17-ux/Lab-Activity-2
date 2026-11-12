
public class Main {

    public static void performService(Serviceable item) {
        item.service();
    }

    public static void main(String[] args) {

        // Create one object of each class
        Car car = new Car("Toyota", "Corolla", 1995, 4);

        Motorcycle motorcycle =
                new Motorcycle("Yamaha", "R15", 2023, 155);

        Truck truck =
                new Truck("Isuzu", "Giga", 2020, 12.5);

        Printer printer = new Printer();

        // Serviceable array
        Serviceable[] serviceItems = {
            car,
            motorcycle,
            truck,
            printer
        };

        System.out.println("===== SERVICE ACTIVITIES =====");

        for (Serviceable item : serviceItems) {
            performService(item);
        }

        // Vehicle array
        Vehicle[] vehicles = {
            car,
            motorcycle,
            truck
        };

        System.out.println("\n===== VEHICLE INFORMATION =====");

        for (Vehicle vehicle : vehicles) {

            System.out.println("\n--------------------");

            vehicle.displayInfo();
            vehicle.move();
        }
    }
}
