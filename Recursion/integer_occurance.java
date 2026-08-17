
//For a given integer array of size N, you have to find all the occurrences (indices) of a given element (Key) and print them. 
// Use a recursive function to solve this problem.
// Sample Input: arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2Sample Output: 1 5 7 8


package Recursion;
import java.util.*;
public class integer_occurance {
    public static void main(String[] args) {
        int key = 2;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        occur(arr,key,index);
    }


    public static void occur(int arr[] , int key ,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == key){
            System.out.print(index + " ");
        }
        occur(arr , key , index+1);
    }
}
