    //         1
    //       2 1 2                        first print spaces then i to 1 desecnding and then 2 to i ascending
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5


public class palindrome_pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<=n;i++){
            for(int j=0;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k =i;k>=1;k--){
                System.out.print(k);
            }
            for(int l = 2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
