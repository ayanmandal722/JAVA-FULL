//print all binary strings of size n which does not consist any consicutive 1

package Recursion;

public class print_unique_binary_string {
    public static void main(String[] args) {
        printString(3 , 0,new String(""));
    }

    public static void printString(int n , int lastpos , String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printString((n-1) , 0 ,str+"0");

        if(lastpos == 0){
            printString((n-1) , 1 , str+"1");
        }
    }
}
