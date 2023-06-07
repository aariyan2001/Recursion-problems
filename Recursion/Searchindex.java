package Recursion;

public class Searchindex {
    //Using Stack builder void
    public static void search(int[] array, int num, int index,int count) {
        //Termination
        if(index==array.length){
            System.out.println(count);
            return ;
        }
        //Business logic
        if(array[index]==num){
            count++;
        }
        //recursive call
        search(array, num, index+1,count);
    }
    public static void main(String[] args) {
        int[] array = {50,20,10,30,20,60};
        search(array, 20, 0,0);
    }
}
