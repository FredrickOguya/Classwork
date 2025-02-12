import java.util.Scanner;

public class switchprizing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prize =0;
        int age=0;
        String member;
        System.out.print("enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("are you a member(yes/no) ");
        member = scanner.nextLine();

        if(age >=0 && age<=12){
            age = 12;
        }
        else if(age >=13 && age<=17){
            age = 17;
        }
        else if(age >= 18 && age<=59){
            age = 59;
        }
        else if(age >59){
            age = 60;
        }
        else{
            System.out.print("wrong input");
        }
        

        switch(member){
            case "yes":
                switch(age){
                    case 12:
                        prize =5;
                        break;
                    case 17:
                        prize =8;
                        break;
                    case 59:
                        prize =12;
                        break;
                    case 60:
                        prize =6;
                        break;
                    
                }
                break;
                case "no":
                    switch(age){
                        case 12:
                        prize =7;
                        break;
                    case 17:
                        prize =10;
                        break;
                    case 59:
                        prize =15;
                        break;
                    case 60:
                        prize =8;
                        break;
                    }
                    break;
        }
        System.out.println("the prize is $" + prize);
        scanner.close();
    }  
}
