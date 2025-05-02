/*493. Reverse Pairs */

/*Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
  */

  class Solution {
    public int reversePairs(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        return mergeSort(nums, 0, nums.length-1);
    }

    private int mergeSort(int[] nums, int left, int right){
        if(left >= right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums, left, mid) + mergeSort(nums, mid+1, right);

        count += countPairs(nums, left, mid, right);

        merge(nums, left, mid, right);

        return count;
    }

    private int countPairs(int[] nums, int left, int mid, int right){
        int count = 0, j = mid + 1; 

        for(int i = left; i <= mid; i++){
            while(j <= right && nums[i] > 2L * nums[j]){
                j++; 
            }
            count += (j - (mid+1));
        }
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while(i <= mid && j <= right){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while(i <= mid) temp[k++] = nums[i++];
        while(j <= right) temp[k++] = nums[j++];

        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}