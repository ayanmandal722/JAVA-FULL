package Recursion;

public class increasing_order {
public static void main(String args[]){
    int n = 10;
    increase(n);
}

public static void increase(int n){
    if(n==1){
        System.out.println(1);
        return ;
    }

    increase(n-1);
    System.out.println(n);
}
}
