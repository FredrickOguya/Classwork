package mosh.fred;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args){
        // 1234567
        
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}