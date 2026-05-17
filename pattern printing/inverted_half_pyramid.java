//           *
//         * *
//       * * *
//     * * * *


public class inverted_half_pyramid {


    public static void pyramid(int n){
        for(int i = 1; i <= n;i++){          //for each line

            for(int j = 1;j<=n-i;j++){       //for spaces
                System.out.print(" ");
            }

            for(int k = 1;k<=i;k++){         //for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        pyramid(4);
    }
}
