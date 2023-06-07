package Recursion;

class Powerof2{
    //Using Stack builder
    public static void power(int num,int pow, int result) {
        //Termination case
        if(pow==0){
            System.out.println(result);
            return;
        }
        //Business logic
        result = result*num;
        //recursive call 
        power(num, pow-1,result);    
    }

    //Using Stack falling return
    public static int power(int num, int pow) {
        //Termination case
        if(pow==0){
            return 1;
        }
        //recursive call
        int result = power(num, pow-1);
        //Business logic
        result = result*2;
        return result;
    }
    public static void main(String[] args) {
        power(2,5,1);
        System.out.println(power(2, 5));
    }
}