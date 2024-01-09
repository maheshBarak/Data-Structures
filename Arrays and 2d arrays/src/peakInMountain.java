public class peakInMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 8, 5, 4, 3 };

        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else
                e = mid;
        }
        System.out.println(arr[e]);
        System.out.println(arr[s]);
    }
}
