//              1 2 3 4 5
//              1 2 3 4
//              1 2 3
//              1 2
//              1



public class inverted_half_pyramid_numbers {

    public static void pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.print(" ");
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
