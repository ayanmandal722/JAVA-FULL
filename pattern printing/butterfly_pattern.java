//      *             *
//      * *         * *
//      * * *     * * *                  for first 4 lines -> stars(i)  + space 2*(n-i)  +  stars(i)
//      * * * * * * * *                   next 4 lines are reverse of first 4 lines
//      * * * * * * * *
//      * * *     * * *
//      * *         * * 
//      *             * 



public class butterfly_pattern {
    public static void butterfly(int n){

                //first half

        for(int i = 1;i<=n;i++){
            //stars
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j =1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            //stars
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //for second half

        for(int i = n;i>=1;i--){
                //stars
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }

            //spaces
            for(int j =1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }

            //stars
            for(int j =1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args) {
        butterfly(5);
    }
}
