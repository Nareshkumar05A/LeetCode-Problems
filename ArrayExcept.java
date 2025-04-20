/*238. Product of Array Except Self */

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
  */

  class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] LP=new int[nums.length];
        int[] RP=new int[nums.length];

        LP[0]=1;
        RP[nums.length-1]=1;

        for(int i=1;i<nums.length;i++)
        {
            LP[i]=LP[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--)
        {
            RP[j]=RP[j+1]*nums[j+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                nums[i]=RP[i];
            }
            else if(i==nums.length-1)
            {
                nums[i]=LP[i];
            }
            else
            {
                nums[i]=LP[i]*RP[i];
            }
        }
        return nums;
    }
}