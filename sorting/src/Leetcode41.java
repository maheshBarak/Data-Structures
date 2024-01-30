import java.util.Arrays;

// 41. First Missing Positive
public class Leetcode41 {
    public static void main(String[] args) {
        int[] nums = {3,-1,0,4,6,5};
        int size = nums.length;

        int i=0;
        while(i<size) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i]<=size && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else i++;
        }
        System.out.println(Arrays.toString(nums));

        for(int j=0;j<size;j++){
            if(nums[j]!=j+1) {
                System.out.println(j+1);
                break;
            }
            else {
                System.out.println(size+1);
                break;
            }
        }

/*            if(correctIndex>0 && nums[i]!=nums[correctIndex]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }else i++;
        }
        int ans=0;
        int j=0;
        while(j<size){
            if(nums[j]>0 && nums[j+1]!=nums[j]+1) {
                ans=nums[j]+1;
                break;
            }
            else j++;
        }
        System.out.println(ans);*/
    }
}
