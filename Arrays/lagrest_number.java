//find the largest number in an array



package Arrays;
import java.util.*;

public class lagrest_number {

    public static int largest(int numbers[],int largest_number){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]>largest_number){
                largest_number = numbers[i];
                
            }
        }
        return largest_number;
    }

    public static void main(String[] args) {
        int numbers[] = {3,4,6,7,8,9,23,11,15,17};
        int largest_number = Integer.MIN_VALUE;

        int value = largest(numbers,largest_number);
        System.out.println("largest number is : " +value);
    }   
}
