package Recursion;

                                    //**************** Aariyan Sahu -- 1000015386 ****************
public class ArraySearchlast {
    //Using Stack builder void
    public static void search(int[] array, int num, int index) {
        //Termination
        if(index<0){
            return;
        }
        //Business logic
        if(array[index]==num){
            System.out.println(index);
            return;
        }
        //recursive call
        search(array, num, index-1);
    }

    //Using Stack Falling return
    public static int Search(int [] array, int num, int index) {
        //Termination
        if(index<0){
            return -1;
        }
        //Business logic
        if(array[index]==num){
            return index;
        }
        //recursive call
        return Search(array, num, index-1);
    }
    public static void main(String[] args) {
        int[] array = {50,20,10,30,20,60};
        search(array, 20, array.length-1);
        System.out.println(Search(array, 20, array.length-1));
    }
}
