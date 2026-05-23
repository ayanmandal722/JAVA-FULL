package Bit_Manipulation;

import java.util.*;

public class Binary_odd_even {

    public static void OddEven(int num){

        int Bitmask = 1;
            //For Even
        if((num & Bitmask) == 0){
            System.out.println("Number is Even");
        } 
            //For Odd
        else{
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        OddEven(num);
    }
    
}
