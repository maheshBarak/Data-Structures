import java.util.Arrays;

public class leetcodeSol1 {
    public static void main(String[] args) {
        int[] freq = new int[2051];

        int[][] year = {
                { 1950, 1961 },
                { 1960, 1971 },
                { 1970, 1981 }
        };

        for (int i = 0; i < year.length; i++) {
            for (int j = year[i][0]; j <= year[i][1]; j++) {
                freq[j]++;
            }
        }
        System.out.println(Arrays.toString(freq));

    }
}
