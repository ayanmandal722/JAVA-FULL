package String;
import java.util.*;

public class palindrome_string {

    public static boolean palindrome(String str){

        for(int i = 0; i < str.length()/2; i++){
            int n = str.length();

            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("String is not palindrome");
                return false;
            }
        }

        System.out.println("String is palindrome");
        return true;
    }

    public static void main(String[] args) {

        String str = "noon";
        palindrome(str);
        
    }
}