/*258. Add Digits */

/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
  */

  class Solution {
    public int addDigits(int num) {
        if(num == 0)
        {
            return 0;
        }
        int count = 0;
        while(num != 0)
        {
            int digit = num %10;
            count += digit;
            num /= 10;
        }
        return count > 9?addDigits(count):count;
    }
}