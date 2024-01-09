import java.util.ArrayList;
import java.util.Arrays;

public class ArrayFormInteger {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 0 };
        int k = 1;
        long num = 0;

        // output ---------> 1021

        for (int i : arr) {
            num = num * 10 + i;
        }

        num += k;
        System.out.println(num);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 30);
        list.add(0, 0);

        System.out.println(list);
        /*
         * int[] arr1 = new int[list.size()];
         * 
         * for (int i = list.size() - 1; i >= 0; i--) {
         * arr1[list.size() - 1 - i] = list.get(i);
         * }
         * 
         * System.out.println(Arrays.toString(arr1));
         */
    }
}
