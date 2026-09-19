//Sort the string array using merge sort


package Devide_and_Conquere;

public class String_Sorting_MergeSort {
    
    public static void main(String[] args) {
        String[] arr = {"ayan" , "rahul" , "asmit" , "yummy"};
        mergesort(arr , 0 , arr.length-1);

        for(String str : arr){
            System.out.print(str + " ");
        }

    }

    public static void mergesort(String[] arr , int low ,int high){

        //base case
        if(low >= high){
            return ; 
        }

        //devide
        int mid = low + (high - low)/2; 
        mergesort(arr , 0 , mid);
        mergesort(arr , mid+1 ,high);


        merge(arr , low , mid ,high);
    }


    public static void merge(String[] arr , int low , int mid , int high){
        String [] temp = new String [high - low +1];

        int i = low;
        int j = mid +1;
        int k = 0;

        //merge
        while(i<=mid && j<=high){
            if(arr[i].compareTo(arr[j]) <= 0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        while(i<=mid){
            temp[k]= arr[i];
            i++;
            k++;
        }

        while(j<=high){
            temp[k] = arr[j];
            j++;
            k++;
        }

        //storing temp value in the main array
        for(int x = 0;x <temp.length;x++){
            arr[low+x] = temp[x];
        }
    }
}

