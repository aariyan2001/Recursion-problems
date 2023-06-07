package Recursion;

public class Prime {
    //using Stack Building void
    public static void isprime(int num, int tmp) {
        //Termination cond
        if(tmp==(int)Math.sqrt(num)){
            System.out.println("The number is prime");
            return;
        }
        //Business logic + recurssion
        if(num%tmp!=0){
            isprime(num, tmp+1);
        }else{
            System.out.println("The number is not prime");
        }        
    }

    //Using Stack Falling return
    public static String is_prime(int num, int tmp) {
        //Termination cond
        if(tmp==(int)Math.sqrt(num)){
            return "The number is prime";
        }
        //Business logic + recurssion
        if(num%tmp!=0){
            return is_prime(num, tmp+1);
        }else{
            return "The number is not prime";
        }        
    }
    public static void main(String[] args) {
        isprime(315,2);
        System.out.println(is_prime(37, 2));
    }
}
    

