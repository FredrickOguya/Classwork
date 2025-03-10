import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //sc.next();
        String h = "hello";
        h.length();
         
        tim("Yoh!",4);
        System.out.println(add2(6));
        System.out.println(str("hello"));
    }

    public static void tim (String str, int x){
        for(int i=0; i<x;i++){
        System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x+2;
    }

    public static String str(String x) {
        return x + "!";
    }
} 

