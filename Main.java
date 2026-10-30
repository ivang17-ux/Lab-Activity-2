
public class Main {

    public static void main(String[] args) {

        // Polymorphic Array
        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 1995, 4),
            new Car("Honda", "Civic", 2018, 4),
            new Motorcycle("Yamaha", "R15", 2023, 155),
            new Truck("Volvo", "FH16", 2020, 20.5)
        };

        // Loop through all vehicles
        for (int i = 0; i < vehicles.length; i++) {

            System.out.println("================================");
            System.out.println("--- Vehicle " + (i + 1) + " ---");
            System.out.println("================================");

            // Display information
            vehicles[i].displayInfo();

            // Display age and vintage status
            System.out.println("Age: " + vehicles[i].calculateAge());
            System.out.println("Vintage: " + vehicles[i].isVintage());

            // Start engine
            vehicles[i].startEngine();

            // Test all abstract movement methods
            System.out.println("\n--- Movement Tests ---");

            vehicles[i].moveForward();
            vehicles[i].moveBackwards();
            vehicles[i].moveLeft();
            vehicles[i].moveRight();

            System.out.println();
        }

        // Testing setYear()
        System.out.println("================================");
        System.out.println("--- Testing setYear() ---");
        System.out.println("================================");

        Vehicle testVehicle = vehicles[0];

        System.out.println("setYear(2000): "
                + testVehicle.setYear(2000));

        System.out.println("Stored Year: "
                + testVehicle.getYear());

        System.out.println("Age: "
                + testVehicle.calculateAge());

        System.out.println("Vintage: "
                + testVehicle.isVintage());

        System.out.println();

        System.out.println("setYear(1885): "
                + testVehicle.setYear(1885));

        System.out.println("Stored Year: "
                + testVehicle.getYear());

        System.out.println();

        System.out.println("setYear(2027): "
                + testVehicle.setYear(2027));

        System.out.println("Stored Year: "
                + testVehicle.getYear());

        // Invalid constructor tests
        System.out.println("\n--- Invalid Constructor Tests ---");

        Vehicle vehicle1885 =
                new Car("Ford", "Mustang", 1885, 2);

        System.out.println("New vehicle with year 1885");
        System.out.println("Initial Year: "
                + vehicle1885.getYear());

        System.out.println();

        Vehicle vehicle2027 =
                new Truck("BMW", "Truck", 2027, 15.0);

        System.out.println("New vehicle with year 2027");
        System.out.println("Initial Year: "
                + vehicle2027.getYear());
    }
}
