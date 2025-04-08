package myproject.examPractice;

import java.util.Arrays;
import java.util.Scanner;

public class sortDescending{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of numbers to arrange: ");
        int n = scanner.nextInt();
        int [] numbers = new int [n];
        for(int i = 0;i<n;i++){
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("The arranged sorted numbers are: ");
        for(int i = n-1;i >= 0; i-- ){
            System.out.println(numbers[i]);
        }
    }
}