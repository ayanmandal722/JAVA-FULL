import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();
        boolean is_prime = true;
        if(n==2){
            is_prime = true;
        }
        else{
            for (int i =2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    is_prime =false;
                    break;
                }
            }
        }
        if(is_prime == true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}
