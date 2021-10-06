package com.company;

public class odd_even {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n) {
        return ( n & 1)==1;
    }
}
