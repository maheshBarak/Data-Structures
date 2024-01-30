
// Cyclic sort can only be used when you have an array of values within a specific range [1,size]
// not be suitable for arrays with elements that exceed the range limitations.
// Cyclic sort assumes that the elements in the array are DISTINCT, meaning there are NO DUPLICATES.

// unstable sorting algorithm


import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 1, 2};
    //    int[] arr = {5, 4, 3, 6, 7};
        int size = arr.length;
        int i=0;

        while(i<size){
            int correctIndex = arr[i]-1;
        //    int correctIndex = arr[i]-3;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
