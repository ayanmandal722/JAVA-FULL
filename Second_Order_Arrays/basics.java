package Second_Order_Arrays;
import java.util.*;

public class basics {
        public static void main(String[] args) {
            int n=3 , m=4 ;
            int arr[][] = new int[n][m];
            Scanner sc = new Scanner(System.in);
        
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            
        }
 {
    
}
}