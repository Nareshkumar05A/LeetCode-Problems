/*238. Product of Array Except Self */

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0] */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the array size:")
        int n=scan.nextInt();
        System.out.print("Enter the array values:")
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*arr[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*arr[i+1];
        }
        int[] pre=new int[n];
        for(int i=0;i<n;i++)
        {
            pre[i]=prefix[i]*suffix[i];
        }
        for(int c:pre)
        {
            System.out.print(c+" ");
        }
    }
}