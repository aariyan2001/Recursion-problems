package Recursion;
class ReverseString{
    //Using Stack Builder void
    public static void rev(String str, String reverse) {
        //Termination 
        if(str.length()==0){
            System.out.println(reverse);
            return;
        }
        reverse = reverse+str.charAt(str.length()-1);
        //recursive call
        rev(str.substring(0, str.length()-1), reverse);

    }

    //Using Stack Falling return
    public static String rev(String str){
        //Termination
        if(str.length()==1){
            return str;
        }
        //recursive call
        String result = rev(str.substring(1));
        //Business logic
        return result+str.charAt(0);
    }
    public static void main(String[] args) {
        rev("Amit", "");
        System.out.println(rev("Amit"));
    }
}