package com.smart.wu;

public class IsPrime {

    public static void isPrime(int n) {
        int sqrt = (int) Math.sqrt(7);
        System.out.println("sqrt==="+sqrt);
        isPrime1(n);
        isPrime2(n);
        isPrime3(n);

    }

    private static void println(String from,int n,boolean isPrime,long time){
        System.out.println(from+"   "   +Integer.toString(n)+(isPrime?"是":"不是")+"质数" +"===耗时=="+time);

    }

    public static boolean isPrime1(int n) {
        long l = System.nanoTime();

        if (n<=3){
            println("1",n,n>1,System.nanoTime()-l);
            return n>1;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                println("1",n,false,System.nanoTime()-l);
                return false;
            }
        }
        println("1",n,true,System.nanoTime()-l);
        return true;
    }

    public static boolean isPrime2(int n) {
        long l = System.nanoTime();

        if (n<=3){
            println("2",n,n>1,System.nanoTime()-l);
            return n>1;
        }

        int sqrt = (int) Math.sqrt(n);
        for (int i=2;i<sqrt;i++){
            if (n%i==0){
                println("2",n,false,System.nanoTime()-l);
                return false;
            }
        }
        println("2",n,true,System.nanoTime()-l);
        return true;
    }


    public static boolean isPrime3(int n) {
        long l = System.nanoTime();

        if (n<=3){
            println("3",n,n>1,System.nanoTime()-l);
            return n>1;
        }
        if(n%6!=1&&n%6!=5){
            println("3",n,false,System.nanoTime()-l);
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i=5;i<sqrt;i+=6){
            if (n%i==0||n%(i+2)==0){
                println("3",n,false,System.nanoTime()-l);
                return false;
            }
        }
        println("3",n,true,System.nanoTime()-l);
        return true;
    }

}
