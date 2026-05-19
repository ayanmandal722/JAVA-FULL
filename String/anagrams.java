//check wheather two strings are nagram to each other
// anagram means both strings have same character but the character order will not be same.like race and care


package String;
import java.util.*;

public class anagrams {

    public static void anagram(String str1 ,String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray); 
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray , str2CharArray);

            if(result){
                System.out.println("Strings are anagrams.");
            }
            else{
                System.out.println("Strings are not anagrams");
            }
        }
        else{
                System.out.println("Strings are not anagrams");
            }   

    }


    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "races";
        anagram(str1,str2);
    }
    
}
