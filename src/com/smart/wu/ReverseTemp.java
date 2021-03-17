package com.smart.wu;

public class ReverseTemp {

    public  static int reverse(int num){
        int x=num;
        int rev=0;
        System.out.println("MAX_VALUE=="+Integer.MAX_VALUE);
        while (x!=0){
            int pop=x%10;
            x/=10;
            System.out.println("rev=="+rev);
            if (rev>Integer.MAX_VALUE/10||(rev==(Integer.MAX_VALUE/10)&&rev==7))return 0;
            if (rev<Integer.MIN_VALUE/10||(rev==(Integer.MIN_VALUE/10)&&rev==-9))return 0;
            rev=rev*10+pop;
        }

        return rev;
    }
}
