import java.util.Scanner;
public class work {
    public static void main(String[] Args){
        System.out.println("Enter the day number: ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        String destination = "";

        switch(day){
            case 1:
                destination = "Multimedia University";
                break;
            case 2:
                destination = "Computer School of Kenya";
                break;
            case 3:
                destination = "JKUAT University";
                break;
            case 4:
                destination = "KCA";
                break;
            default:
                destination = "Invalid day";
            break;

        }
        System.out.println(destination);
    }
}
