import java.util.Arrays;

public class intersection2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] ans = intersectionArray(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] intersectionArray(int[] nums1, int[] nums2) {
        int[] res = new int[3];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]) {
                    res[0]=nums1[i];
                }
            }
        }
        return res;
    }
}
