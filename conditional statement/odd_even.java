import java.util.*;

public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num%2 == 0 ){
            System.out.print(num + " is even");
        }
        else{
            System.out.print(num+ " is odd");
        }
    }
}
