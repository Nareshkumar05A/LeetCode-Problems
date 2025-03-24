/*Max Product of Array - 1464 */

/*Given an integer array nums, return the maximum product of two distinct elements in the array such that:nums[i] - 1) * (nums[j] - 1) where i ≠ j.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

2 <= nums.length <= 500 1 <= nums[i] <= 10^3

Output Format

Print a single integer, the maximum product of two distinct elements in the array using the given formula.

Sample Input 0

4  
3 4 5 2  
Sample Output 0

12
Explanation 0

If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)(nums[2]-1) = (4-1)(5-1) = 3*4 = 12. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length == 0)
        {
            System.out.print(0);
            return;
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            int cot = (arr[i]-1) * (arr[i+1]-1);
            ans = Math.max(cot,ans);
        }
       System.out.print(ans);
    }
}