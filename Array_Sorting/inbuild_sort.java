package Array_Sorting;
import java.util.*;
public class inbuild_sort {

     public static void printArr(int arr[]){
        for (int j = 0;j<arr.length;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr1[] = {5,1,2,7,6};
        int arr2[] = {5,1,4,6,2};


        Arrays.sort(arr1);     //direct we can sort like this without any sorting method

        printArr(arr1);

        Arrays.sort(arr2,0,3);  //to sort from one index to another index.ending index will be index+1
        printArr(arr2);



                    //FOR DESCENDING ORDER


        Integer arr3[] = {5,1,2,7,6};
        Integer arr4[] = {5,1,4,6,2};

        Arrays.sort(arr3,Collections.reverseOrder());     //for over descending sorting

        Arrays.sort(arr4,0,3,Collections.reverseOrder());    //for descending sorting from one index to another index



        for(int i = 0;i<arr3.length;i++){
            System.out.print(arr3[i]);
        }
        System.out.println();
        for(int i = 0;i<arr3.length;i++){
            System.out.print(arr4[i]);
        }


    }

}
