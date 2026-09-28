public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("Toyota", "Corolla", 1995),
            new Vehicle("Honda", "Civic", 2018),
            new Vehicle("Tesla", "Model 3", 2023)
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("--- Vehicle " + (i + 1) + " ---");

            vehicles[i].displayInfo();
            System.out.println("Age: " + vehicles[i].calculateAge());
            System.out.println("Vintage: " + vehicles[i].isVintage());

            System.out.println();
        }
    }
}