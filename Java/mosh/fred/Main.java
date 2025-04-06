package mosh.fred;

public class Main {
    public static void main(String[] args){
        String message = "Hello World" + "!!";
        
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!","*"));
        System.out.println(message.contains("Hello"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);

    }
}