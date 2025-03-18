/*A Strong Number is a number whose sum of the factorial of its digits is equal to the original number.

For example, 145 is a Strong Number because: 1! + 4! + 5! = 1 + 24 + 120 = 145

You need to write a program to check whether a given number is a Strong Number or not.

Input Format

A single integer N

Constraints

1≤N≤10^5

Output Format

Print "YES" if the number is a Strong Number. Otherwise, print "NO"

Sample Input 0

145
Sample Output 0

YES
Explanation 0

1! + 4! + 5! = 1 + 24 + 120 = 145, so it is a Strong Number.

 */

 import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int original=num;
        if(num==0)
        {
            System.out.print("NO");
            return;
            
        }
        int sum=0;
        while(num!=0)
        {
            int fact=1;
            int digit=num%10;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
            sum+=fact;
            num/=10;
        }
       
        if(original==sum)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}