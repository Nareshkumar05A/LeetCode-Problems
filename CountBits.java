/*338. Counting Bits */

/*Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

 

Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10
Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101
  */

  class Solution {

    public static int isBinary(int val)
    {
        int sum = 0;
        int[] Binary = new int[20];
        int i = 0;
        while(val != 0)
        {
            int digit = val % 2;
            Binary[i++] = digit;
            val /= 2;
        } 
        for(int j = i - 1; j >= 0; j--)
        {
            sum += Binary[j];
        }
        System.out.print(sum);
        return sum;
    }
    public static int[] countBits(int n) {
        int result = 0;
        int[] ans = new int[n + 1];
        int k = 0;
        for(int i = 0; i <= n; i++)
        {
            ans[k++] = isBinary(i);
        }
        return ans;
    }
}