/*Move Zeros - 283 */

/*Given an integer array nums, move all 0's to the end of the array while maintaining the relative order of the non-zero elements.

You must do this in-place without making a copy of the array.

Input Format

The first line contains an integer N, the size of the array.

The second line contains N space-separated integers, the elements of the array.

Constraints

1 <= nums.length <= 104 -231 <= nums[i] <= 231 - 1

Output Format

Print the modified array after moving all zeroes to the end.

Sample Input 0

5  
0 1 0 3 12  
Sample Output 0

1 3 12 0 0  
Explanation 0

All non-zero elements are shifted to the left, and all zeroes are moved to the right while keeping the relative order. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];
        for(int i=0;i<n;i++)
        {
            input[i] = scan.nextInt();
        }
        int j = 0;
        for(int i=0;i<n;i++)
        {
            if(input[i] != 0)
            {
                  int temp = input[i];
                  input[i] = input[j];
                  input[j] = temp;
                j++;
            }
        }
        for(int num : input)
        {
            System.out.print(num+" ");
        }
    } 
}
