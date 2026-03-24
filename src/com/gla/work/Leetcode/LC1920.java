package com.gla.work.Leetcode;

public class LC1920 {
    class Solution {
        public int[] buildArray(int[] nums) {
            int n = nums.length;
            int[]ans=new int[n];
            for(int i=0;i<n;i++){
                ans[i]=nums[nums[i]];
            }
            return ans;
        }
    }
public static void main(String[] args){}
}
