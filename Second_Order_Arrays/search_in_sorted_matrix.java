package Second_Order_Arrays;

public class search_in_sorted_matrix {

    public static boolean sorted(int matrix[][] , int target){
        int row = 0;
        int column = matrix.length -1;
        
        while(row<matrix.length && column>=0){

            if(matrix[row][column] == target){
                System.out.println("found key at (" +row +"," +column +") index");
                return true;
            }
            
            else if(matrix[row][column] > target){
                column -- ;
            }

            else if(matrix[row][column] < target){
                row++;
            }
            else{
                System.out.println("target key not found");
                return false;

            }
        }
        return false;
        
    }

    public static void main(String[] args) {
        int matrix [][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target = 39;

        sorted(matrix ,target);
        
    }
}
