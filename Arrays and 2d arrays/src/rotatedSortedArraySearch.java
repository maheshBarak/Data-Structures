public class rotatedSortedArraySearch {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1 };
        int target = 0;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        System.out.println("peak " + peak);
        if (peak == -1) {
            return binarSearch(nums, 0, nums.length - 1, target);
        } else if (peak == target)
            return peak;
        else if (nums[0] > target)
            return binarSearch(nums, 0, peak - 1, target);
        else
            return binarSearch(nums, peak + 1, nums.length - 1, target);
    }

    private static int binarSearch(int[] nums, int s, int e, int target) {
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (target < nums[mid])
                e = mid - 1;
            else if (target > nums[mid])
                s = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int findPeak(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < e && nums[mid] > nums[mid + 1])
                return mid;
            if (mid > s && nums[mid - 1] > nums[mid])
                return mid - 1;

            if (nums[s] >= nums[mid])
                e = mid - 1;
            if (nums[s] < nums[mid])
                s = mid + 1;
        }
        return -1;
    }
}
