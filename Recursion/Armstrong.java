package Recursion;
                                    //**************** Aariyan Sahu -- 1000015386 ****************

class Armstrong{
    //Using Stack Builder void
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
    //using Stack Falling return
    public static int Arms(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        //recursive call
        int result = Arms(num/10);
        //Business logic
        result =  (int)(result+Math.pow(num%10,3));
        return result;
    }

    public static void main(String[] args) {
        int num = 153;
        Arms(num,0,num);  //Using Stack Building
        System.out.println(num==Arms(num)?"Armstrong":"Not an Armstrong");  //Using Falling return type
    }
}