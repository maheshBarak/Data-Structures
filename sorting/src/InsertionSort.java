import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 19, 7, 5, 12, 10};

        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else break;    // all numbers before j already sorted.
        //        System.out.println(Arrays.toString(arr));
            }
        //    System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }
}
