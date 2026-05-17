//if array is {2,4,5} then pairs will be {2,4} , {2,5} , {4,5}


package Arrays;
import java.util.*;

public class pairs_in_array {
    
    public static void pair(int arr[]){
        for(int i = 0;i<arr.length;i++){
            int curr= arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print("(" +curr +"," +arr[j] +")" +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[] = {2,4,5,9,6,11};
        pair(arr);


    }
}
