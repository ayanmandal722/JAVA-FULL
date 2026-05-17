public class decimal_to_binary {
     

    public static void DecToBin(int DecNum){    
        int my_num = DecNum;
        int binary = 0;
        int power = 0;
        while(DecNum > 0){
            int rem = DecNum % 2;    //rem means remainder
            binary = binary + rem * ((int)Math.pow(10,power));
            power++;
            DecNum /=2;
        }

        System.out.println("Decimal to binary of " +my_num + " is " +binary);

    }


    public static void main(String[] args) {
        DecToBin(22);
    }
}