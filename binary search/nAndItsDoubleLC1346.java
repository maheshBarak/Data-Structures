public class nAndItsDoubleLC1346 {
    public static void main(String[] args) {
        int[] arr = {5,2,10,3};
      //  int[] arr = {3,1,7,11};

        // output = true

        boolean ans = checkNandDouble(arr);
        System.out.println(ans);
    }

    private static boolean checkNandDouble(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]) return true;
            }
        }
        return false;
    }
}
