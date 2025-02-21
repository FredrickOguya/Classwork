import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args){
        ArrayList<Integer> t = new ArrayList<Integer>();
        t.add(1);
        t.add(2);
        t.add(5);
        t.add(7);
        t.add(4);
        t.add(5);
        t.get(0);
        t.set(1, 5);
        t.size();
        System.out.println(t.subList(1, 3));
    }

        
} 
