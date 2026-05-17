//for {2,3,4,5} subarrays are {2} , {2,3} , {2,3,4} ,{2,3,4,5} , {3} , {3,4} ,{3,4,5} , {4} , {4,5}

package Arrays;
import java.util.*;
public class subarray {
    
    public static void subarray(int numbers[]){

        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j= i;j<numbers.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){
                    System.out.print(numbers[k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int numbers[] = {2,3,4,5};

        subarray(numbers);
    }
}
