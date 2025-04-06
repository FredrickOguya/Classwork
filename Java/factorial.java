public static void main (String[] arg){
    //receive input
    System.out.println("Enter the number:");
    Scanner number = new Scanner(System.in);
    int n = number.nextInt();
    //calculating
    int factorial = fact(n);
    System.out.println("The factorial of " + n + " is " + factorial);
}
static int fact(int n) {
    if (n == 0) {
        return 1;
    }
    return n * fact(n - 1);
}