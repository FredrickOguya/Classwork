import java.util.Scanner;

public class thermometer {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double currentTemp = scanner.nextDouble();

        System.out.println("current temperature is " + currentTemp);
        if(currentTemp>30.0)
        System.out.println("It is too hot");
    }
}
