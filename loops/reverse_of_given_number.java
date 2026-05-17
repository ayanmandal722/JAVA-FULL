import java.util.*;

public class reverse_of_given_number {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rev = 0;
        int last_degit = 0;
        while(num>0){
            last_degit = num % 10;
            rev = ((rev * 10) + last_degit);
            num/=10;
        }
        System.out.print(rev);
    }   
}
