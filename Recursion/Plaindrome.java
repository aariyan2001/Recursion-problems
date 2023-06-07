package Recursion;

class Plaindrome{
    //Using Stack builder
    public static void isplaindrome(String str,int index) {
        //Termination case
        if(index == Math.round(str.length()/2)){
            System.out.println("The string is plaindrome");
            return;
        }
        //recursive call + Business logic
        if(str.charAt(index) == str.charAt(str.length()-1-index)){
            isplaindrome(str, index+1);
        }else{
            System.out.println("String is not a plaindrome");
            return;
        }    
    }

    //using return Stack Falling
    public static String isplaindrome(String str) {
        int length = str.length();
        //Termination
        if (length <= 1) {
            return "The String is palindrome";
        }
        //recursive call + Business logic
        if (str.charAt(0) == str.charAt(length - 1)) {
            return isplaindrome(str.substring(1, length - 1));
        } else {
            return "The String is not a palindrome";
        }
    }
    public static void main(String[] args) {
        isplaindrome("amitima",0);
        System.out.println(isplaindrome("ABB")); 
    }
}