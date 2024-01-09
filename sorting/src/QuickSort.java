import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 19, 7, 5, 12, 10};

        for(int i=0;i<arr.length-1;i++){
            System.out.println("i = "+i);
            for(int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));
    }
}
