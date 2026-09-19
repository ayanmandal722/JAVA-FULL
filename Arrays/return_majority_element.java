package Arrays;

public class return_majority_element {
    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2,2,8};
        int value = majority(arr);
        System.out.println(value);
    }

    public static int majority(int[] arr){
        int candidate = 0;
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if(count == 0){
                candidate = arr[i];
            }

            if(candidate == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
