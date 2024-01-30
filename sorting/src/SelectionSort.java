import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12, 4, 11, 3, 19, 7, 5, 10};
        int n=arr.length;


        for(int i=0;i<n;i++){
            int lastIndex = n-1-i;
            int maxIndex = findMax(arr,0,lastIndex);
            swapNumber(arr,lastIndex,maxIndex);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapNumber(int[] arr, int lastIndex, int maxIndex) {
        int temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int findMax(int[] arr, int startIndex, int lastIndex) {
        int max = startIndex;
        for(int i=0;i<=lastIndex;i++){
            if(arr[max]<arr[i]) max = i;
        }
        return max;
    }

}
