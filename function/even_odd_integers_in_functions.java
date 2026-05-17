
import java.util.*;
public class even_odd_integers_in_functions {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number : ");
       int n = sc.nextInt();
       

       if (is_even(n)){
        System.out.println("number is even");
       }
       else {
        System.out.println("number is odd");
       }
    }


    public static boolean is_even(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
}
