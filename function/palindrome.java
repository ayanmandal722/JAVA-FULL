//Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not)



import java.util.*;

public class palindrome {

    public static int reverse(int n){
        int reverse = 0;
        if(n>0){
            int last_degit = 0;
            while(n>0){
                last_degit = n % 10;
                reverse = (reverse * 10) + last_degit;
                n = n / 10 ;
            }
            
        }
        return reverse;
    }


    public static boolean palindrome_number(int n){
        if(n == reverse(n)){
            return true;
        }
        return false;

        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n =sc.nextInt();
        if(palindrome_number(n)){
            System.out.println(n +" is palindrome");
        }
        else{System.out.println(n +" is not palindrome");}
    }
}
