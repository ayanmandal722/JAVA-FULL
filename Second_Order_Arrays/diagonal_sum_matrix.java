package Second_Order_Arrays;

public class diagonal_sum_matrix {
    public static int diagonal(int matrix[][]){
        int sum = 0;
        for(int i = 0;i<matrix.length;i++){
            sum += matrix[i][i];
            
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]= {
            {5,6,7},
            {1,2,3},
            {7,5,3}
        };
        int index = diagonal(matrix);
        
        System.out.println(index);
    }
}
