package Bit_Manipulation;

public class Check_number_is_power_of_Two {
    
    public static boolean CheckPowerOfTwo(int num){
        return (num & (num - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(CheckPowerOfTwo(8));
    }
}
