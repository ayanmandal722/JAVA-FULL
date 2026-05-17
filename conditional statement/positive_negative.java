//Write code to check to check the number is positve or negative


import java.util.*;
public class positive_negative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        if(num>=0){
            System.out.print(num + " " + "is positive");
        }else{System.out.print(num + " " + "is negative");}
    }
}
