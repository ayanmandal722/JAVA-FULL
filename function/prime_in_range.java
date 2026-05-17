import java.util.*;
public class prime_in_range {
    public static boolean is_prime(int num){
        if(num ==2){
            return true;
        }
        for (int i = 2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }   
        }
        return true;
    }
    public static void PrimeInRange(int num){
        for(int i=2;i<=num;i++){
            if(is_prime(i)==true){
                System.out.print(i +"  ");
            }
        }
    }


    public static void main(String[] args) {
        PrimeInRange(17);
    }
}
