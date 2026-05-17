package Arrays;
import java.util.*;
public class linear_search {


    public static int linear(int number[],int n){
        for(int i =0;i<=number.length;i++){
            if(number[i]==n){
                return i;
            }
    }
        return -1;
}
    
    public static void main(String[] args) {
        int number[] = {3,4,5,6,7,8,9,10,11};
        int n = 3;
        int index = linear(number,n);

        if(index==-1){
            System.out.println("Not Found");
        }
        else{System.out.println("number is at inderx : " +index);}
        }
        
    }

