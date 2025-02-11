/*Write an application that reads the lengths of the sides of a triangle
from the user. Compute the area of the triangle using Heron’s formu-
la (below), in which s represents half of the perimeter of the triangle,
and a, b, and c represent the lengths of the three sides. Print the area
to three decimal places.
Area = √s(s - a)(s - b)(s - c) */
import java.util.Scanner;
public class firstAssignmentTriangleArea {
    public static void main (String[] arg){
        System.out.println("Enter the first length of the triangle");
        Scanner le1 = new Scanner(System.in);
        double a = le1.nextDouble();
        System.out.println("Enter the second length of the triangle");
        Scanner le2 = new Scanner(System.in);
        double b = le2.nextDouble();
        System.out.println("Enter the third length of the triangle");
        Scanner le3 = new Scanner (System.in);
        double c = le3.nextDouble();

        double s = (a + b +c) /2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        if (a+b>c && a+c>b && b+c>a){
            System.out.println("The area of the triangle is");
            System.out.println(area);
        }else
            System.out.print("Enter valid lengths of a rectangle");
        


    }
}