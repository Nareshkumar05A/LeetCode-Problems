/*4. Median of Two Sorted Arrays */

/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
  */

  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            arr[k++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++)
        {
            arr[k++]=nums2[j];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
      int n=arr.length;
if(n%2==0)
{
    return (arr[n/2-1]+arr[n/2])/2.0;
}
else
{
    return arr[n/2];
}
    }
}