import java.util.Scanner;

public class primeNumber {
    public static void main (String args[]){
        System.out.println("Enter The number");
        Scanner in = new Scanner(System.in);
        
        int n = 100;
        int i = 1;
        
        int count=0;
        int sum = 0;
        while (i<=n){
            if(n%i==0){
                count++;
                sum+=i;
            }
            i++;
        } 
        
        if (count == 2){
            System.out.println(n + " is a prime number");
            System.out.println(sum);
        }else {
            System.out.println(n + " is not a prime number");
        }
        System.out.println(sum);
    }
}
