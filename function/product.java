
// package MyJava.function;


import java.util.*;

public class product {
    public static int ProductOfNumbers(int a , int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = ProductOfNumbers(a,b);
        System.out.println("Product is : " +product);
    }

}
