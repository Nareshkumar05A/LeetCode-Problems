
/*Missing number - 268 */

/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

LEETOCE LINK:-

   [MISSING NUMBER](https://leetcode.com/problems/missing-number/)
Input Format

input should be a array

Constraints

1<=n<=100

Output Format

output should be an number

Sample Input 0

4
3 1 0 2
Sample Output 0

4 */

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
         int xor1=0;
        int xor2=0;
        for(int i=1;i<=arr.length;i++)
        {
            xor1^=i;
        }
        for(int num:arr)
        {
            xor2^=num;
        }
        System.out.print(xor1^xor2);
    }
}