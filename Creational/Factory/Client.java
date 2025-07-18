
import java.util.Scanner;

public class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter vehicle type (CAR / BIKE / TRUCK): ");
        String input = sc.nextLine().trim().toUpperCase();

        try {
            VehicleType type = VehicleType.valueOf(input);
            Vehicle vehicle = VehicleFactory.getVehicle(type);
            System.out.println("Price: ₹" + vehicle.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid vehicle type. Please enter CAR, BIKE, or TRUCK.");
        }
        
    }
}