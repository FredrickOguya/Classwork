import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the radius from the user
        System.out.print("Enter the radius of the sphere: ");
        double r = scanner.nextDouble();
        
        // Compute volume and surface area
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double surfaceArea = 4 * Math.PI * Math.pow(r, 2);
        
        // Print results with four decimal places
        System.out.printf("Volume: %.4f%n", volume);
        System.out.printf("Surface Area: %.4f%n", surfaceArea);
        
        scanner.close();
    }
}
