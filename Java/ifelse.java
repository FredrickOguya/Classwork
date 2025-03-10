import java.util.Scanner;

public class ifelse{
    public static void main(String[] args){
        System.out.println("Enter marks");
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        String comments = "";
        if(marks > 0 && marks <=49){
            comments = "not yet compentent";
        }else if(marks >49 && marks <= 69){
            comments = "compentent";
        }else if(marks >69 && marks <=79){
            comments = "profficience";
        }else if(marks >79 && marks <=89){
            comments = "mastery";
        }else{
            comments = "invalid";
        }
        System.out.println(comments);
    }
}
