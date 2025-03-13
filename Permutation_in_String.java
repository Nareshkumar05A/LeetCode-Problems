/*Permutation in String*/

 /*Example 1:
    intput:"abc"
    output:[abc, acb, bac, bca, cab, cba]

   Example 2:
   input:"nka"
   output:[nka, nak, kna, kan, ank, akn]
 */

 import java.util.*;
 class Main
 {
     public static void permutation(String str,String ans,List<String>result)
     {
        if(str.length()==0)
        {
            result.add(ans);
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String res=str.substring(0,i)+str.substring(i+1);
            permutation(res,ans+ch,result);
        }
     }
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter a String");
         String str=scan.nextLine();
         List<String>result=new ArrayList<>();
         permutation(str,"",result);
         System.out.println(result);
     }
 }