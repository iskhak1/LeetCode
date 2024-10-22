package ru.gb;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
            if(x<0) return false;

            int temp = x;
            int reverse = 0;

            while(temp!=0){

                int digit = temp%10;
                reverse = reverse * 10 + digit;
                temp /= 10;

            }

        return (reverse==x);
    }

}
