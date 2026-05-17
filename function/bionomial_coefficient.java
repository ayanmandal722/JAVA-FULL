
import java.util.*;
public class bionomial_coefficient {
    public static int factorial( int num1){
        int fact = 1;
        for(int i = 1;i<=num1;i++){
            fact *= i;
        }
        return fact;
    }
    public static int bionomial(int n,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);
        int bionomial = n_fact/(r_fact * n_r_fact);
        return bionomial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of n : ");
        int n = sc.nextInt();
        System.out.println("Enter number of r : ");
        int r = sc.nextInt();
        System.out.println(bionomial(n , r));
        
    }
}
