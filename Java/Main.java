import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main (String[] args){

        Set<Integer> t = new LinkedHashSet<>()<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        t.remove(9);
        t.clear();
        t.isEmpty();
        t.size();

        boolean x = t.contains(5);

        System.out.println(t);

    }

        
} 
