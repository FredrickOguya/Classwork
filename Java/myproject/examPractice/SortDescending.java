package myproject.examPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortDescending {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of elements to sort: ");
int n = input.nextInt();
Integer[] numbers = new Integer[n]; // Use Integer array for Collections.reverseOrder()
System.out.println("Enter the " + n + " numbers:");
for (int i = 0; i < n; i++) {
numbers[i] = input.nextInt();
}
// Sort the array in descending order using Collections.reverseOrder()
Arrays.sort(numbers, Collections.reverseOrder());
System.out.println("\nSorted numbers in descending order:");
for (int number : numbers) {
System.out.print(number + " ");
}
System.out.println();
input.close();}
}