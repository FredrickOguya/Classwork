import java.util.ArrayList;
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
        Map m = new LinkedHashMap();
        m.put("tim",5);
        m.put("joe",'x');
        m.put("11","999");
        m.put("a","b");
        
        m.containsValue("b");
        m.containsKey(5);

        m.get(5);


        System.out.println(m.isEmpty());
    }

        
} 
