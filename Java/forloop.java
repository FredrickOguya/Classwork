public class forloop {
    public static void main(String[] args){
        int i=1;
        int total = 0;
        for(;;){
            if(i<=50){
                if(i%2!=0)
                    total+=i;
                    i++;
            }else{
                break;
            }
        }
        System.out.println(total);

    }
}
