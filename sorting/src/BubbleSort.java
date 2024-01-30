import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 4, 11, 3, 19, 7, 5, 10};
        int n=arr.length;

        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    swapNumber(arr,j,j-1);
                    swapped=true;
                }
        //        System.out.println(Arrays.toString(arr));
            }
            if(!swapped) break;
        //    System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapNumber(int[] arr, int lastIndex, int maxIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
