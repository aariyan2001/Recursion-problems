package Recursion;

public class SearchandReplace {
    //Using Stack Builing void
    public static void S_R(int[] array, int search, int replace, int index) {
        //Termination
        if(index == array.length){
            return;
        }
        //Business logic
        if(array[index] == search){
            array[index] = replace;
        }
        System.out.println(array[index]);
        //recursive call
        S_R(array, search, replace, index+1);
    }
    public static void main(String[] args) {
        int[] array = {50,20,10,30,10,40,10};
        S_R(array, 10, 100, 0);
    }
}
