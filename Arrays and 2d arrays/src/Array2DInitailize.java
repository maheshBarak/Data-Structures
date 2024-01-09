import java.util.Arrays;
import java.util.Scanner;

public class Array2DInitailize {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int [3][2];

        System.out.println(arr.length);

        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
