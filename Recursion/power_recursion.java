package Recursion;
        // x to the power n  = x * x to the power n-1
public class power_recursion {
    public static void main(String[] args) {
        int x = 2;
        int pow = 4;
        System.out.println(power(x,pow));
    }
    public static int power(int x , int pow){
        if(pow == 0){
            return 1;
        }

        return x * power(x , pow-1);
    }
}
