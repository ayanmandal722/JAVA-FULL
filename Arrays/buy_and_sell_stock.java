package Arrays;
import java.util.*;
public class buy_and_sell_stock {
    

    public static int stock(int price[]){

        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0;i<price.length;i++){
            if(price[i] < buy_price){
                buy_price = price[i];
                for(int j = i;j<price.length;j++){
                    int sell_price = price[j];
                    int profit = sell_price - buy_price;
                    max_profit = Math.max(profit,max_profit);
                }
                
            }
        }
        return max_profit;
    }


    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};

        System.out.println(stock(price));
    }
}
