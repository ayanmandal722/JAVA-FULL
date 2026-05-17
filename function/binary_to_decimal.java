


public class binary_to_decimal {


    public static void BinToDec(int BiNumber){
        int my_num = BiNumber;
            int power = 0;
            int decimal = 0;
            while(BiNumber>0){
                int last_degit = BiNumber % 10;
                decimal = decimal + (last_degit * (int)Math.pow(2,power));  //Math.pow returns double type value so we haev to convert in into int by type casting
                power++;
                BiNumber /= 10;
            }
            System.out.println("Decimal of " +my_num +" is " +decimal);
    }


    public static void main(String[] args) {
        BinToDec(111);
    }
}
