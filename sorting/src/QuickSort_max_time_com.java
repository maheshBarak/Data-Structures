import java.util.Arrays;

public class QuickSort_max_time_com {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 19, 7, 5, 12, 10};

        for(int i=0;i<arr.length-1;i++){
            System.out.println("i ="+i);
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(arr));
    }
}
