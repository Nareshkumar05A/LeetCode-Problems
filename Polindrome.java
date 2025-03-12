/*9. Palindrome Number */
/*Given an integer x, return true if x is a palindrome, and false otherwise. */

/*Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */

import java.util.*;
class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int num=scan.nextInt();
        int original=num;
        int rev=0;
        if(num<0)
        {
            System.out.println("false");
        }
        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(original==rev)
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}