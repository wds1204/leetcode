package com.smart.wu;

public class IsValid {

    public static boolean isValid(String s) {
        if (s==null||!isStartValid(s.charAt(0)))return false;


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
