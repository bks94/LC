import java.util.Arrays;
public class lc1 {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedArr=new int[nums.length];
        System.arraycopy(nums,0,sortedArr,0, nums.length);
        Arrays.sort(sortedArr);
        int x=0,
            y=nums.length-1;
        while(true)
        {
            int sum=sortedArr[x]+sortedArr[y];
            if (sum==target)
                break;
            if (sum>target)
                y--;
            if (sum<target)
                x++;
            if (x==y)
                break;
        }
        for (int i = 0; i < nums.length; i++)
            if (sortedArr[x]==nums[i]) {
                x = i;
                break;
            }

        for (int i = 0; i < nums.length; i++)
            if (sortedArr[y]==nums[i] && i!=x) {
                y = i;
                break;
            }

        return new int[]{x,y};
    }
}
