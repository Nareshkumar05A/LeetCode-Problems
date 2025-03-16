/*50. Pow(x, n) */

/*Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
  */

  import java.util.*;
class Pattern
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the X value:");
        double x= scan.nextDouble();
        System.out.println("Enter the power value:");
        int n= scan.nextInt();
        double result=1;
        for(int i=0;i<Math.abs(n);i++)
        {
            result=result*x;
        }
        if(n<0)
        {
            result=1/result;
        }
        System.out.println(result);
    }
}