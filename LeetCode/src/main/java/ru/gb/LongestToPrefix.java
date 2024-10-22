package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestToPrefix {

    public static void main(String[] args) {

        longestCommonPrefix(new String[]{"FLowees","FLoweeswwewe","FLoweesadsda"});

    }
    // first solve
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<0) return "";
        StringBuilder collectChar = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if(first.charAt(i) != last.charAt(i)){
                return collectChar.toString();
            }
            collectChar.append(first.charAt(i));

        }

      return collectChar.toString();

    }
     //second solution
    public static String longestCommonPrefixS(String[] strs) {

        String temp = strs[0];
        int length = temp.length();

        for (int i = 0; i < strs.length; i++) {
            String l =  strs[i];
            while(length<0 || !temp.equals(l.substring(0,length))){
                length--;
                if(length==0){
                    return "";
                }

                temp = temp.substring(0,length);
            }

        }

        return temp;

    }

}
