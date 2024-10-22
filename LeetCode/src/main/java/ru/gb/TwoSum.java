package ru.gb;

import java.util.Arrays;

public class TwoSum {


    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        twoSum(new int[]{3,3},6)
                )
        );
    }

    public static int[] twoSum(int[] nums, int target) {
        int res = 0;
        int[] resarr = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            res = nums[i] + nums[i+1];
            if(target==res){
                resarr[0] = i;
                resarr[1] = i+1;
                break;
            }else{
                resarr[0]=0;
                resarr[1]=0;
            }
        }

        return resarr;
    }
}

