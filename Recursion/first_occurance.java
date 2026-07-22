package Recursion;

public class first_occurance {
    public static void main(String[] args) {
        int arr [] = {7};
        int n = 6;
        System.out.println(occurance(arr , n , 0));
    }
    
    public static int occurance(int arr[] , int n , int i){
        
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }

        return occurance(arr , n , i+1);
}
}
