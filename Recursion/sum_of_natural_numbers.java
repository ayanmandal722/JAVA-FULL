package Recursion;

public class sum_of_natural_numbers {
    public static void main(String args[]){
        int num = 5;
        System.out.println(sum(num));
    }
    
    public static int sum(int num){
        int sum = 0;
        if(num <= 0){
            return 0;
        }
        return num + sum(num-1);
        
    }
}
