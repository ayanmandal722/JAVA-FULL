package Recursion;

public class fibonacci_series {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n){

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fibOfnM1 = fibonacci(n-1);        //fibOfnM1 means fibonaaci of (n-1)
        int fibOfnM2 = fibonacci(n-2);

        int fibOfn = fibOfnM1 + fibOfnM2;

        return fibOfn;
    }
}
