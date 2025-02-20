import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Type a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int count = 0;
        do{
            System.out.println("Type a number: ");
            x = sc.nextInt();
        }while (x!=10);

    }

        
} 
