package com.smart.wu;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {

    public static boolean isValid(String s) {

        int sqrt = (int) Math.sqrt(14);
        System.out.println("sqrt====="+sqrt);

        if (s==null||s.length()%2==1||!isStartValid(s.charAt(0)))return false;
       HashMap<Character,Character>map= new HashMap<Character,Character>(){
           {
               put(')','('); put(']','['); put('}','{');
           }
        };
        int count = s.length();
        char start = s.charAt(0);

        Stack<Character> stack = new Stack<>();
        stack.push(start);

        for (int i=1;i<count;i++){
            char c = s.charAt(i);
            if (isStartValid(c)){
               stack.push(c);
            }else {
                if (!(map.get(c) ==stack.pop()))return false;
            }
        }

        return true;

    }

    private static boolean isStartValid(char c) {
        switch (c) {
            case '(':
            case '{':
            case '[':
                return true;
            default:
                return false;
        }
    }
}
