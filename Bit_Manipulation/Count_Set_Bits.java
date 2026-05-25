//Count the number of 1 in a number.

package Bit_Manipulation;

public class Count_Set_Bits {

    public static int CountSetBits(int num){

        int count  = 0;
        while(num >0){
            if((num & 1) !=0){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountSetBits(15));
    }
    
}
