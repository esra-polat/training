import java.util.Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                transpose[j][i] = matrix[i][j];

        for (int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int row=0; row<transpose.length; row++){
            for(int col=0; col<transpose[0].length; col++) {
                System.out.print(transpose[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
