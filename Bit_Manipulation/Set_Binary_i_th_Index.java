//It coverts the i-index to 1

package Bit_Manipulation;

public class Set_Binary_i_th_Index {
    public static int SetIndex(int num , int index){
        int Bitmask = 1<<index;    //remember the Bitmask
        
        return num | Bitmask;
        }

    public static void main(String[] args) {
        System.out.println(SetIndex(10,2));
    }
}
