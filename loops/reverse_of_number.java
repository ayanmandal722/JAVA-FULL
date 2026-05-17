import java.util.*;
public class reverse_of_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int last_degit = 0;
        while(num>0){
            last_degit = num % 10;
            System.out.print(last_degit);
            num = num / 10;
        }
    }
}
