import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    int year;

    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year:  " + year);
    }
}
class Car extends Vehicle {
    String fuelType;

    public Car(String brand, String model, int year, String fuelType) {
        
        super(brand, model, year);
        this.fuelType = fuelType;
    }
 
    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year of Manufacture: ");
        int year = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        Car myCar = new Car(brand, model, year, fuelType);

        System.out.println("Displaying Car Details");
        myCar.displayDetails();

        scanner.close();
    }
}