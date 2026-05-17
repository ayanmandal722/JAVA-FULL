
//Write a Java method to compute the sum of the digits in an integer.




import java.util.*;


public class sum_of_degits {


    public static int sum(int n){
        int sum = 0;
        int last_degit = 0;
        while(n>0){
            last_degit = n % 10;
            sum = sum + last_degit;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();

        System.out.println("sum of degits is : " +sum(n));
    }
}
