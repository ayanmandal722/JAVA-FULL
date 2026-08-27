package Devide_and_Conquere;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = {5,3,7,2,8};
        mergeSort(arr , 0 , arr.length-1);
        printArr(arr);


    }

    public static void mergeSort(int arr[] , int si , int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei)/2;
        mergeSort(arr,si,mid);  //sorting left part
        mergeSort(arr,mid+1,ei);  //sorting right part
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[] ,int si , int mid,int ei){
        int temp[] = new int[ei-si+1];  //to combine all sorted arrays we took one temporary array
         //to calculate the exact arr size as index 0 will be calculated
        int i = si; //iterator for left part
        int j = mid+1 ; //iterator for right part

        int k = 0;  //iterator for temprary array

        while(i<=mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
        }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //we comnbine all now if there any element is still remains to add in the temp arr so 

        while(i<=mid){      //if any element is there in right part
            temp[k++] = arr[i++];
        }

        while(j<=ei){      ////if any element is there in left part
            temp[k++] = arr[j++];
        }

        //now copy the temp arr to the main arr

    for(k=0,i=si; k<temp.length; k++,i++){
        arr[i] = temp[k];
        }
    }



    public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
