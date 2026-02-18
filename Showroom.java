import java.util.Scanner;

public class Showroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user for data
        System.out.print("Enter Car Brand: ");
        String brand = input.nextLine();

        System.out.print("Enter Car Model: ");
        String model = input.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int year = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter Fuel Type: ");
        String fuel = input.nextLine();

        // Instantiate Car object
        Car myCar = new Car(brand, model, year, fuel);

        // Call displayDetails
        System.out.println("\n--- Showroom Car Display ---");
        myCar.displayDetails();

        input.close();
    }
}