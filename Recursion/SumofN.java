package Recursion;
                                        //**************** Aariyan Sahu -- 1000015386 ****************
                                        
public class SumofN {
    //Using Stack building void
    public static void NSum(int num,int sum) {
        //Termination
        if(num==0){
            System.out.println(sum);
            return;
        }
        //Business Logic
        sum = sum+num;
        //Recursive call
        NSum(num-1,sum);        
    }

    //using Stack Falling
    public static int Nsum(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        //recursive call
        int result = Nsum(num-1);
        //Business Logic
        result = result+num;
        return result;
    }
    public static void main(String[] args) {
        NSum(5 , 0);
        System.out.println(Nsum(5));
    }
}
