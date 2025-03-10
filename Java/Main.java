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
        Map m = new HashMap();

        String str = "hello my name is tim and i am cool";

        for(char x:str.toCharArray()){
            if(m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x,old+1);
            } else {
                m.put(x, 1);
            }

        }

        System.out.println(str.toCharArray());
    }

        
} 
