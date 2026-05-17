package Arrays;
import java.util.*;
public class max_subarray_sum {
    public static void max_subarray(int numbers[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j= i;j<numbers.length;j++){
                int end = j;
                current_sum = 0;
                for(int k = start;k<=end;k++){
                    current_sum += numbers[k];
                }
                if(max_sum<current_sum){
                    max_sum = current_sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum is : " +max_sum);
    }


    public static void main(String[] args) {
        int numbers[] = {2,3,4,5};

        max_subarray(numbers);
    } 
}
