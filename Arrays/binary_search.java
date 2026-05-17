package Arrays;
import java.util.*;
public class binary_search {
    
public static int binary(int numbers[],int target){

     int start = 0;
     int end = numbers.length -1;

     while(start<=end){
        int mid = (start + end) / 2;

        if(numbers[mid] == target){
            return mid;
        }
        else if(numbers[mid] > target){
            end = mid - 1;
        }
        else if(numbers[mid] < target){
            start = mid + 1;
        }
     }
     return -1;

}

public static void main(String[] args) {
    int numbers[] = {2,3,5,6,7,8,9,32,65,67,69,70};
    int target = 65;

    int index = binary(numbers,target);
    
    if(index == -1){
        System.out.println("not found");
    }
    else{
        System.out.println(index);
    }

}


}
