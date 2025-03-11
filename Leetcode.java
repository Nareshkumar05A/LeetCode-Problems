/*1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
            int[] nums={2,7,11,15};
            int target=9;
        int[] arr=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;

                }
            }
        }
        System.out.print(arr[0]+" "+arr[1]);
    }
}
