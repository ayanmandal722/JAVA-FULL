// given integer array sums.return true if a number is repeated in diffrent index otherwise retuen false if all numbers are distinct
// {2,3,4,5,6} = fasle       {2,2,4,5,6} = true
//we are using brute force  

package Arrays;

public class repeated_number_inArray {
    

    public static boolean repeated(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,2,3,2,3,4,4,6};
        System.out.println(repeated(arr));
    }
}
