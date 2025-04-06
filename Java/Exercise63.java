import java.util.*;

public class Exercise63 {
    public static void main(String[] arg){
        int target = 18;
        int  []x = {99,49,-4,18,66};
        int index = searchMe(x,target);
        
        if (index >= 0 )
        System.out.println("Target was found at index " + index);
        else System.out.println("target was not found on the array;");
    }
    static int searchMe(int[] a, int n){
        for(int i= 0; i<a.length;i++){
            if(a[i] == n)
                return i;
            else if (i ==a.length -1)
                return -1;
        }
    }
    
}