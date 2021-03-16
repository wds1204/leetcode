package com.smart.wu;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    /**
     * 哈希表
     * 时间复杂的 O(N) N是数组中的元素数量，对每一个元素x,我们可以O(1)的寻找target-x
     * 空间复杂的 O(N) 其中N是数组中的元素数量，主要为哈希表的开销
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumfix(int[] nums,int target){
        HashMap<Integer,Integer> integerHashMap = new HashMap<Integer, Integer>();

        for (int i=0;i<nums.length;i++){
            if (integerHashMap.containsKey(target-nums[i])){
                return new int[]{integerHashMap.get(target-nums[i]),i};
            }
            integerHashMap.put(nums[i],i);
        }
        return new int[0];
    }
    /**
     * 暴力枚举
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

}
