/*242. Valid Anagram */

/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
       
        
       char[] schar=str1.toCharArray();
       char[] tchar=str2.toCharArray();
        if(schar.length!=tchar.length)
        {
            System.out.print("false");
            return;
        }
       Arrays.sort(tchar);
       Arrays.sort(schar);
      if(Arrays.equals(tchar,schar))
      {
          System.out.print("true");
      }
        else
        {
            System.out.print("false");
        }
    }
}