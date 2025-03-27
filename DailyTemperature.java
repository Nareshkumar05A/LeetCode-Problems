/*Rising temperature 1 */

/*Given an array of integers temperatures represents the daily temperatures, print an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

Input Format

8
73 74 75 71 69 72 76 73

Constraints

solve it brute force then try to solve in O(n) using stack .

Output Format

1 1 4 2 1 1 0 0

Sample Input 0

8
73 74 75 71 69 72 76 73
Sample Output 0

1 1 4 2 1 1 0 0 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int[] result=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()])
            {
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }
        for(int ch:result)
        {
            System.out.print(ch+" ");
        }
    }
}