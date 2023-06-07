package Recursion;

public class Countzero {
    //Using Stack builder void
    public static void count(int num, int Zerocount) {
        //Termination
        if(num==0){
            System.out.println(Zerocount);
            return;
        }
        //Business logic
        if(num%10 == 0){
            Zerocount++;
        }
        //recursive call
        count(num/10,Zerocount);
    }

    //Using Stack Falling
    public static int count(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        //recursive call
        int Zerocount = count(num/10);
        //business logic
        if(num%10==0){
            Zerocount++;            
        }
        return Zerocount;
    }
    public static void main(String[] args) {
        count(1024050, 0);
        System.out.println(count(1024050));
    }
}
