package Recursion;
                                    //**************** Aariyan Sahu -- 1000015386 ****************
                                    
public class Sumofseries {
    //using stack builder void
    public static void seriesSum(int num, double sum) {
        //Termination
        if(num==0){
            System.out.println(sum);
            return;
        }

        //Business logic
        sum = sum + (num/(Math.pow(num,num)));
     
        //recursive call
        seriesSum(num-1,sum);
    }

    //Using Stack Falling 
    public static double seriesSum(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        //recursive call
        double result = seriesSum(num-1);
        //business logic
        return result + (num/(Math.pow(num,num)));
    }
    public static void main(String[] args) {
        seriesSum(5, 0.0);
        System.out.println(seriesSum(5));
    }
}
