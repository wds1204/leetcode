package com.smart.wu;
/**
 * 罗马字转数字
 */
public class RomanToInt {
    //MCMXCIV
    //1000 -100 1000 -10 100 -1 5 =1994



    //解答思路  数字的右边比自己大就是负数，数字比右边的数大则为正数。
    // 这道理的解题思路就是 先确认罗马数字对应数字，再确认这些数字前面正负符号
    public static int romanToInt(String s) {
        int preNum = switchInt(s.charAt(0));
        int sum=0;

        for (int i = 1; i < s.length(); i++) {
            int num=switchInt(s.charAt(i));

            if (preNum<num){
                sum-=num;
            }else {
                sum+=num;
            }
            preNum=num;
        }
        return sum+preNum;

    }

    private static int switchInt(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}