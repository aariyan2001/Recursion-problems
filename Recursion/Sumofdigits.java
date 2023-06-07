package Recursion;
                                        //**************** Aariyan Sahu -- 1000015386 ****************

class Sumofdigits{
    //Using Stack Building void
    public static void digitsum(int num, int sum) {
        //Termination
        if(num==0){
            System.out.println(sum);
            return;
        }
        sum = sum+(num%10);
        digitsum(num/10,sum);
    }

    //Using Stack Falling
    public static int digitsum(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        //recursive call
        int sum = digitsum(num/10);
        //business logic
        int lastdigit = num%10;
        return sum+lastdigit;        
    }
    public static void main(String[] args) {
        digitsum(123,0);
        System.out.println(digitsum(134)); 
    }
}