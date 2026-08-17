package Recursion;

public class factorial {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        int result = n * fact(n-1);
        return result;
    }
    
}
 