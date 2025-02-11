import java.util.Scanner;
public class firstAssignmentSphereVolume {
    public static void main (String[] arg){
        //receive input
        System.out.println("Enter the radius:");
        Scanner radius = new Scanner(System.in);
        double r = radius.nextDouble();
        //calculating
        double volume = 4.0/3.0* Math.PI * Math.pow(r,3);
        
        System.out.println("The volume is");
        System.out.println(volume);
    }
}
