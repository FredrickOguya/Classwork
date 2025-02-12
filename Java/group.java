import java.util.Scanner;
public class group {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Are you a member? (yes/no)");
        String member = input.nextLine().toLowerCase();

        if(age>=0 && age <= 12 && member.equals("yes")){
            System.out.println("Ticket price is  $5");
        } else if(age>=0 && age <= 12 && member.equals("no")){
            System.out.println("Ticket price is  $7");
        }else if(age>=13 && age <= 17 && member.equals("yes")){
            System.out.println("Ticket price is  $8");
        }else if(age>=13 && age <= 17 && member.equals("no")){
            System.out.println("Ticket price is  $10");
        }else if(age>=18 && age <= 59 && member.equals("yes")){
            System.out.println("Ticket price is  $12");
        }else if(age>=18 && age <= 59 && member.equals("no")){
            System.out.println("Ticket price is  $15");
        }else if(age>59 && member.equals("yes")){
            System.out.println("Ticket price is  $6");
        }else if(age>59 && member.equals("no")){
            System.out.println("Ticket price is  $8");
        }else{
            System.out.println("Invalid input");
        }
    }
}
