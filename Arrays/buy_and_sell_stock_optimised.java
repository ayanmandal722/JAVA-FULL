// given the prices of different days.You have to find the max profit by buying stock on a day and selling it on another day.

package Arrays;
import java.util.*;
public class buy_and_sell_stock_optimised {
    

    public static int stock(int price[]){

        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0;i<price.length;i++){
            if(buy_price < price[i]){
                    int profit = price[i] - buy_price;
                    max_profit = Math.max(max_profit , profit);
                }
            else{
                buy_price = price[i];
            }   
            }
            return max_profit;
        }



    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};

        System.out.println(stock(price));
    }
}
