/*Subarray Sums Divisible by K - 974 */

/*Given an integer array nums and an integer k, return the total number of continuous subarrays whose sum is divisible by k.

Input Format

The first line contains two integers n and k – the size of the array and the divisor.

The second line contains n space-separated integers – the array elements.

Constraints

1 <= n <= 3 * 10^4

-10^4 <= nums[i] <= 10^4

1 <= k <= 10^4

Output Format

Print a single integer – the number of subarrays whose sum is divisible by k.

Sample Input 0

6 5  
4 5 0 -2 -3 1
Sample Output 0

7
Explanation 0

There are 7 subarrays with a sum divisible by k = 5: [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3] */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}