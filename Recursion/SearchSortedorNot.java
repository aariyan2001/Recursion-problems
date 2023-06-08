package Recursion;
                                        //**************** Aariyan Sahu -- 1000015386 ****************

public class SearchSortedorNot {
    //Using STack building void
    public static void SortOrNot(int arr[], int index){
        //Termination
        if(arr.length-2==index){
            System.out.println("sorted");
            return;
        }
        //Business Logic
        if(arr[index]<arr[index+1]){
            SortOrNot(arr, index+1);   //Recursive call    
        }
        else{
            System.out.println("Not sorted");
        }
    }
    //using stack falling return
    public static boolean isSorted(int array[],int index) {
        //Termination
        if(array.length-2==index){
            return true;
        }
        //Business Logic 
        if(array[index]>array[index+1]){
            return false;
        }

        return isSorted(array, index+1); //recursive call
    }

    public static void main(String[] args) {
        int num[] = {10,20,30,40,50};
        SortOrNot(num, 0);  //Using Stack builder void
        System.out.println(isSorted(num, 0)==true?"Sorted":"Not Sorted");//Using Falling return type
        
    }
}
