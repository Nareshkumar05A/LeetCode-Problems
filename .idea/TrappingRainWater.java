/* 42 Trapping rain water 50 */

/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

image

Input Format

12
0 1 0 2 1 0 1 3 2 1 2 1

Constraints

solve in O(n)

Output Format

6

Sample Input 0

12
0 1 0 2 1 0 1 3 2 1 2 1
Sample Output 0

6
Explanation 0

video reference YTube link

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] height = new int[n];
        
        for(int i=0;i<n;i++)
        {
            height[i]=scan.nextInt();
        }
        int[] pre = new int[n];
        int[] suf = new int[n];
        
        int max = height[0];
        for(int i=0;i<n;i++)
        {
            if(height[i] >= max)
            {
                max = height[i];
            }
            pre[i] = max;
        }
        
        max = height[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(height[i] > max)
            {
                max = height[i];
            }
            suf[i] = max;
        }
        
        int result = 0;
        for(int i=0;i<height.length;i++)
        {
            int ans = Math.min(pre[i],suf[i]);
            result += Math.abs(ans - height[i]);
        }
        
        System.out.print(result);
    }
}

