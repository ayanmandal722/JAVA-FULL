package Arrays;
import java.util.*;

public class max_subarray_sum_kadanas {
    
    public static void kadane(int arr[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            curr_sum += arr[i];
            if(curr_sum < 0){
                curr_sum = 0;
            }
            max_sum = Math.max(curr_sum , max_sum);
        }
        System.out.println("our max subarray sum is:" +max_sum);
    }

    public static void main(String[] args) {
        int arr[] ={-2,4,5,-2,7,-13};
        kadane(arr);
    }
}
