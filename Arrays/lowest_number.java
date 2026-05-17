package Arrays;
import java.util.*;
public class lowest_number {
    
    public static int lowest(int numbers[],int lowest_number){
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]<lowest_number){
                lowest_number = numbers[i];
                
            }
        }
        return lowest_number;
    }

    public static void main(String[] args) {
        int numbers[] = {3,4,6,7,8,9,2,23,11,15,17};
        int lowest_number = Integer.MAX_VALUE;

        int value = lowest(numbers,lowest_number);
        System.out.println("lowest number is : " +value);
    }
}
