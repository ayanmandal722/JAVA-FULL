package Devide_and_Conquere;

public class search_target_in_sorted_array {
    
    public static int search(int arr[] ,int tar ,int si , int ei){

        if(si>ei){
            return -1;
        }

        //finding mid
        int mid = si + (ei-si)/2;

        //base case
        if(arr[mid] == tar){
            return mid;
        }

        //if mid on L1
        if(arr[si] <= arr[mid]){
            //case a : mid left search
            if(arr[si] <= tar && tar <=arr[mid]){
                return search(arr , tar , si , mid-1);
            }

            //case b : mid right search
            else{
                return search(arr , tar , mid+1 , ei);
            }
        }


        //if mid on L2
        else{
            //case c :mid right search
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr , tar , mid+1 , ei);
            }

            //case d : mid left search
            else{
                return search(arr , tar , si , mid-1);
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIndex = search(arr , target , 0 , arr.length-1);
        System.out.println(tarIndex);
    }
}
