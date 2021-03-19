package com.smart.wu;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        TwoSum twoSum = new TwoSum();
//        System.out.println("暴力枚举法");
//        int[] nums = twoSum.twoSum(new int[]{1, 3, 5, 12, 10}, 4);
//        for (int num:nums) {
//            System.out.println("======"+num);
//        }
//
//        System.out.println("哈希表法");
//        int[] numsfix = twoSum.twoSumfix(new int[]{1, 3, 5, 12, 10}, 4);
//        for (int num:numsfix) {
//            System.out.println("======"+num);
//        }

//        System.out.println("翻转整数");
//
//        int reverse = ReverseTemp.reverse(2147483647);
//        System.out.println("2147483647===>"+reverse);


//        System.out.println("回文数");
//
//        boolean palindrome = Palindrome.isPalindrome(1211);
//
//        System.out.println("121 ==="+palindrome);
//        System.out.println("罗马数字转整数");
        //1000 100 1000 10 100 1  5
        //1000 100 500 10 100 1  5
        //1000 900 90
//        int num = RomanToInt.romanToInt("MCMXCIV");
//        System.out.println("MCMXCIV  num==="+num);


        System.out.println("最长公共前缀");

        String s = LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});

        System.out.println("[\"flower\",\"flow\",\"flight\"]最长公共前缀"  +s);
    }
}
