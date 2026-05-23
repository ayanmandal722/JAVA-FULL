//it coverts the i-th index to 0

package Bit_Manipulation;

public class Clear_Binary_i_th_Index {
    
    public static int ClearIndex(int num , int index){
        int Bitmask = ~(1<<index);    //remember the Bitmask
        
        return num & Bitmask;
        }

    public static void main(String[] args) {
        System.out.println(ClearIndex(10,1));
    }
}
