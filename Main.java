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

            
            System.out.println("Brand: " + vehicles[i].getBrand());
            System.out.println("Model: " + vehicles[i].getModel());
            System.out.println("Year: " + vehicles[i].getYear());

            
            System.out.println("Age: " + vehicles[i].calculateAge());
            System.out.println("Vintage: " + vehicles[i].isVintage());

            System.out.println();
        }

        
        System.out.println("--- Testing setYear() ---");

        Vehicle testVehicle = vehicles[0];

        System.out.println("setYear(2000): " + testVehicle.setYear(2000));
        System.out.println("Stored year: " + testVehicle.getYear());
        System.out.println("Age: " + testVehicle.calculateAge());
        System.out.println("Vintage: " + testVehicle.isVintage());

        System.out.println();

        System.out.println("setYear(1885): " + testVehicle.setYear(1885));
        System.out.println("Stored year: " + testVehicle.getYear());

        System.out.println();

        System.out.println("setYear(2027): " + testVehicle.setYear(2027));
        System.out.println("Stored year: " + testVehicle.getYear());

        System.out.println();

       
        System.out.println("--- Invalid Constructor Tests ---");

        Vehicle vehicle1885 = new Vehicle("Ford", "Mustang", 1885);
        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year: " + vehicle1885.getYear());

        System.out.println();

        Vehicle vehicle2027 = new Vehicle("BMW", "M3", 2027);
        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year: " + vehicle2027.getYear());
    }
}