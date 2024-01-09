import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] mat = {
                { 0, 0, 0 },
                { 4, 1, 3 },
                { 1, 1, 1 }
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                if (i != j) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int s = 0;
            int e = mat.length - 1;
            while (s < e) {
                int temp = mat[i][s];
                mat[i][s] = mat[i][e];
                mat[i][e] = temp;
                s++;
                e--;
            }
        }
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }

        /*
         * for (int i = 0; i < mat.length; i++) {
         * for (int j = i; j < mat.length; j++) {
         * if (mat[i][j] != target[i][j])
         * return false;
         * }
         * }
         */
    }
}
