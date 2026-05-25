package Bit_Manipulation;

public class Swap_numbers_using_Bit_manipulation {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
         //use shall use XOR concept.a ^ a =0

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.print(a + " , " +b);
}
}