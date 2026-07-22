package Recursion;

public class last_occurance {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,4,6,7,8};
        int n =7;
        int i = arr.length -1;
        System.out.println(last_occurance(arr , n , i));
    }

    public static int last_occurance(int arr[] , int n , int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == n){
            return i;
        }
        return last_occurance(arr , n ,i-1);
    }
}
