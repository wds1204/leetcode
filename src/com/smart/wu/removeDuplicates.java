package com.smart.wu;

public class removeDuplicates {

    public static int removeDuplicates(int nums[]){
        if (nums==null||nums.length==0)return 0;
        int p=0 ;int q=1;
        while (p<nums.length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
                q++;
            }else {
                q++;
            }
        }
        return p+1;
    }
}
