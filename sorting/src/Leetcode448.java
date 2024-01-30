// 448. Find All Numbers Disappeared in an Array
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        // Output: [5,6]
        int size = nums.length;

        int i=0;
        while(i<size){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else i++;
            System.out.println(i +" "+ Arrays.toString(nums));
        }
        //System.out.println(Arrays.toString(nums));
    }

}
// jha number missing hoga wha duplicate number aajega after cyclic sorting
