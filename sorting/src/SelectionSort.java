public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12 ,4, 1, 3, 19, 7, 5, 10};

        for(int i=arr.length-1;i>=0;i--){
            int max = findMaxElementIndex(arr);
            System.out.println(arr[max]);
        }
    }

    private static int findMaxElementIndex(int[] arr) {
        int maxEleIndex = 0;
        for(int i=1;i< arr.length-1;i++){
            if(arr[i]> arr[maxEleIndex]){
                maxEleIndex=i;
            }
        }
        return maxEleIndex;
    }

}
