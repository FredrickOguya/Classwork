import java.util.Scanner;

public class bloodonation {
    public static void main(String[] args){
        System.out.println("Enter your Weight: ");
        Scanner in = new Scanner(System.in);
        int Weight = in.nextInt();
        System.out.println("Enter Your Age: ");
        int age = in.nextInt();

        if (Weight > 50 && age < 60 && age > 12){
            System.out.println("eligible");
        }else{
            System.out.println("ineligible");
        }

    }
}
