import java.util.Scanner;
public class grading  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks");
        double marks = scanner.nextDouble()

        if(marks>70)
            System.out.println("A");
        else if(marks >60 && marks<70)
            System.out.println("B");
        else if(marks >50 && marks< 60)
            System.out.println("C");
        else if(marks > 40 && marks <50)
            System.out.println("D");
        else if(marks > 0 && marks < 40)
            System.out.println("F");
        else
            System.out.println("Error");

    }
}
