package src.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args) {
        TwoSum ts= new TwoSum();
        int[] nums={2,7,11,15};
        int target=9;

        System.out.println(Arrays.toString(ts.twoSum(nums,target)));

    }
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer>map=new HashMap<>();

        for (int i=0;i<nums.length;i++)
        {
            int needed=target-nums[i];
            if(map.containsKey(needed))
            {
                System.out.println("index of "+map.get(needed)+ ","+i);
                return new int[] {map.get(needed),i};
            }
            map.put(nums[i],i);
        }
        return nums;
    }
}
