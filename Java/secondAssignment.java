
/*The system should take a visitors age and membership status as input and determine the ticket price based on:

1. Children age betweeen 0 and 12 > if members, ticket price is 5$ otherwise $7
2. teenagers between 17 and $7 $10
3. adults 18&59 $12 $15
4. Senours $6 $8 */

import java.util.Scanner;
public class secondAssignment {
    public static void main(String[] arg){
        System.out.println("Enter your age: ");
        Scanner year = new Scanner(System.in);
        int age = year.nextInt();

        System.out.println("Enter Membership Status: If yes, please input 'true' and if not a member please input 'false'");
        Scanner memberStatus = new Scanner(System.in);
        boolean membership = memberStatus.nextBoolean();

    int price = 0;

        if (age < 0)
            System.out.println("Invalid age");
        else if(age>0 && age <= 12 && membership == true)
            price = 5;
        else if (age>0 && age <= 12 && membership == false)
            price = 7;
        else if (age >12 && age <=17 && membership == true)
            price = 7;
        else if (age >12 && age <=17 && membership == false)
            price = 10;
        else if (age >17 && age <= 59 && membership == true)
            price = 12;
        else if (age >17 && age <= 59 && membership == false)
            price = 15;
        else if (age > 59 && membership == true)
            price = 6;
        else if ( age > 59 && membership == false )
            price = 8;
        
    System.out.println("The ticket price in dollars($) is:");
    System.out.println(price);

    }
}
