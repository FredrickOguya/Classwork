import java.util.Scanner;
public class Weekdays {
    public static void main(String args[])
    {
        Scanner weekday = new Scanner(System.in);

        System.out.println("please input the day ");
        int day = weekday.nextInt();
        
        String weekdayString=null;
        switch(day){
            case 1: weekdayString ="Monday";
            break;
            case 2: weekdayString = "Tuesday";
            break;
            case 3: weekdayString = "Wednesday";
            break;
            case 4: weekdayString = "Thursday";
            break;
            case 5: weekdayString = "Friday";
            break;
            case 6: weekdayString = "Saturday";
            break;
            case 7: weekdayString = "Sunday";
            break;
            default: weekdayString = "Unknown weekday";
        }
        System.out.println("THe day of the week is " + weekdayString);
    }
}
