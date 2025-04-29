/* 917. Reverse Only Letters */

/*Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

 

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
  */

  class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;
        while(left < right)
        {
            if(!Character.isLetter(ch[left]))
            {
                left++;
            }
            else if(!Character.isLetter(ch[right]))
            {
                right--;
            }
            else
            {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}
