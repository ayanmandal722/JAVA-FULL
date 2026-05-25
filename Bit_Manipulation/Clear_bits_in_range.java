package Bit_Manipulation;

public class Clear_bits_in_range {

    public static int ClearBitsRange(int value , int i , int j){

        int a =  ((~0)<<(j+1));
        int b = (1<<i)-1;

        int Bitmask = a|b;

        return value & Bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ClearBitsRange(10,2,4));
    }
}
