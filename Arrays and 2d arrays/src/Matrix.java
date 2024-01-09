import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }

        // after tranpose total rows and colums will change. so we need new array for
        // the transpose matrix
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (i != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
