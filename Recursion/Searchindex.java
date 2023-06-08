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

    //Using Stack Falling return
    public static int search(int[] array, int num, int index) {
        //Termination case
        if(index==array.length){
            return 0;
        }
        //recursive call
        int count = search(array, num, index+1);
        //Business logic
        if(array[index]==num){
            count++;
            return count;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] array = {50,20,10,30,20,60};
        search(array, 20, 0,0);
        System.out.println(search(array,20,0));
    }
}
