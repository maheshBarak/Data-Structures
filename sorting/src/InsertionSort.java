public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 19, 7, 5, 12, 10};

        for(int i=0;i< arr.length-2;i++){
            for(int j=i+1;j< arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}
