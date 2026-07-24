//given a floor of 2*n sized floor .You have to find out the number of ways to put 2*1 sized of tiles to covered the whole floor

package Recursion;

public class Tiling_problem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tiling(n));
    }

    public static int tiling(int n){

        if(n==0 || n==1){
            return 1;
        }

//choices

//vertical
        int fNm1 = tiling(n-1);
//horizontal
        int fNm2 = tiling(n-2);

        int total_ways = fNm1 + fNm2;

        return total_ways;
    }
}
