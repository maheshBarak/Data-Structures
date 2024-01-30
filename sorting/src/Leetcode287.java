import java.util.Arrays;

// 287. Find the Duplicate Number
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class Leetcode287 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int size = nums.length;

        int i=0;
        while(i<size){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else i++;
        }
        System.out.println(i +" "+ Arrays.toString(nums));
    }
}
