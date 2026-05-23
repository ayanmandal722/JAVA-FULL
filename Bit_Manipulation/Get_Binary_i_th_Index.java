package Bit_Manipulation;

public class Get_Binary_i_th_Index {

    public static int GetIndex(int num , int index){
        int Bitmask = 1<<index;    //remember the Bitmask
        if ((num & Bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(GetIndex(10,3));
    }
    
}
