package com.smart.wu;

/**
 *    最长公共前缀
 */
public class LongestCommonPrefix {

    /**
     * 找到字符串数组中 各个字符串最长公共前缀
     * 解题思路，逐各比较，先确定一个公共最长前缀，依次和后一个字符串比较确认前缀，依次类推。
     * 如果俩两比较发现为空时，推出比较"
     * ：一个小优化，先确认俩两字符串最短需要比较的长度
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String [] strs){
        if (strs==null||strs.length==0)return "";
        int count=strs.length;
        String preStr=strs[0];
        for(int i=1;i<count;i++){
            preStr=longestCommonPrefix(preStr,strs[i]);
            if (preStr.length()==0)break;
        }

        return preStr;
    }

    private static String longestCommonPrefix(String str1,String str2){
       int length= Math.min(str1.length(),str2.length());
       int index=0;
       while (index<length&&(str1.charAt(index)==str2.charAt(index))){
           index++;
       }
       return str1.substring(0,index);
    }
}
