package com.smart.wu;

/**
 * 回文数
 */
public class Palindrome {

    public static boolean isPalindrome(int x) {
        //负数或者个位数为0的数且不为0的数 必然不是回文数
        if (x<0||(x%10==0&&x!=0))return false;
        //  翻转数组后面一般的数，与前一半的数比较，如果相同这是回文数，
        //例如 1221 只需要翻转21，得到的结果是12，与前半部分数12比较相同
        //现在的问题是，如果确定数字的一半在哪，这里比较巧妙的是，前一部分大于后部分，在没到一半
        //
        //1221 1231  121  132
        // 1221%10=1，1221/10=122， 122%10=2，122/10=12，
        // 1*10+2=12
        // x>revertedNmber
        int revertedNumber=0;
        while (x>revertedNumber){
            revertedNumber=x%10+revertedNumber*10;
            x=x/10;
        }
        //1  12
        //122 12
        //1 12
        //12 1

        return (revertedNumber==x||x==revertedNumber/10);
    }
}
