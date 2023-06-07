package Recursion;
                                    //**************** Aariyan Sahu -- 1000015386 ****************

class Armstrong{
    public static void Arms(int num,int sum,int global){        
        //Termination step
        if(num==0){
            if(sum==global){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not an Armstrong");
            }
            return;
        }
        sum = (int)(sum+Math.pow(num%10,3)); //Business Logic
        
        Arms(num/10, sum, global); //Recursive call     
    
    }

    public static int Arms(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        int result = Arms(num/10);
        result =  (int)(result+Math.pow(num%10,3));
        return result;
    }

    public static void main(String[] args) {
        int num = 152;
        Arms(num,0,153);  //Using Stack Building
        System.out.println(num==Arms(num)?"Armstrong":"Not an Armstrong");  //Using Falling return type
    }
}