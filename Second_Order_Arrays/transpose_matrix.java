package Second_Order_Arrays;

public class transpose_matrix {

    public static void transpose(int matrix[][]){
        int row = matrix.length ;
        int column = matrix[0].length;

        int transpose_matrix[][] = new int[column][row];

        for(int i = 0;i<row;i++){
            for(int j = 0;j<column;j++){
                transpose_matrix[j][i] = matrix[i][j];
            }
        }

        printMatrix(transpose_matrix);
    }

    public static void printMatrix(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {00,01,02},
            {10,11,12}
            };
        System.out.println("main matrix is : ");
        printMatrix(matrix);
        System.out.println("transpose of this matrix is : ");
        transpose(matrix);

    }
    
}
