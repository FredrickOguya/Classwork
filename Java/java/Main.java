package java;

import java.util.ArrayList;


public class Main {
    public static void main (String[] args){
        Dog tim = new Dog("tim", 4);
        tim.speak();
        Dog bill = new Dog("bill", 7);
        bill.speak();
        Dog bob = new Dog("bob", 11);
        bob.speak();

        tim.setAge(10);
        tim.speak();

    }
} 

