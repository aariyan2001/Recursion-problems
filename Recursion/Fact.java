package Recursion;

class Fact{
    //using Stack Builder void
    public static void factorial(int num,int product) {
        //Termination
        if(num==0){
            System.out.println(product);
            return;
        }
        //Business logic
        product = product*num;
        //recursive call
        factorial(num-1,product);
    }
    //Using Stack Falling
    public static int factorial(int num) {
        //Termination
        if(num==1 || num==0){
            return 1;
        }
        //recursive call
        int product = factorial(num-1);
        //Business logic
        return product*num;
    }
    public static void main(String[] args) {
        factorial(5, 1);
        System.out.println(factorial(5));
    }
}