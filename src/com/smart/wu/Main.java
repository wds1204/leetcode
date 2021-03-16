package com.smart.wu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TwoSum twoSum = new TwoSum();
        System.out.println("暴力枚举法");
        int[] nums = twoSum.twoSum(new int[]{1, 3, 5, 12, 10}, 4);
        for (int num:nums) {
            System.out.println("======"+num);
        }

        System.out.println("哈希表法");
        int[] numsfix = twoSum.twoSumfix(new int[]{1, 3, 5, 12, 10}, 4);
        for (int num:numsfix) {
            System.out.println("======"+num);
        }
    }
}
