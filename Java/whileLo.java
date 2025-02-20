public class whileLo {
    public static void main(String args[])
    {
        int i = 1;
        int sum = 0;

        while(i<=50)
        {
            if(i%2!=1){
                sum+=i;
            } 
         i++;
        }
        System.out.println(sum);
    }
}
