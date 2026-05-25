package Bit_Manipulation;

public class Clear_last_i_th_bits {

    public static int ClearBits(int value , int index){

        int Bitmask = (~0)<<index;

        return Bitmask & value;
    }
    public static void main(String[] args) {
        
        System.out.println(ClearBits(15,2));
    }
    
}
