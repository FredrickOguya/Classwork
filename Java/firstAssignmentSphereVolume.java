/*Write an application that reads the radius of a sphere and prints its
volume and surface area. Use the following formulas. Print the out-
put to four decimal places. r represents the radius.
Volume = 4/3πr²
Surface area = 4πr²
*/
import java.util.Scanner;
public class firstAssignmentSphereVolume {
    public static void main (String[] arg){
        //receive input
        System.out.println("Enter the radius:");
        Scanner radius = new Scanner(System.in);
        double r = radius.nextDouble();
        //calculating
        double volume = 4.0/3.0* Math.PI * Math.pow(r,3);
        double surfaceArea = 4.0*Math.PI *Math.pow(r,2);
        
        System.out.println("The volume is");
        System.out.println(volume);
        System.out.println("The Surface area is: ");
        System.out.println(surfaceArea);
    }
}
