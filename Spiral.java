/*54. Spiral Matrix */

/*Given an m x n matrix, return all elements of the matrix in spiral order.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:


Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
  */

  class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>result=new ArrayList<>();
        int cls=0;
        int rs=0;
        int re=matrix.length-1;
        int cle=matrix[0].length-1;
 while(cls<=cle&rs<=re){
        for(int i=cls;i<=cle;i++)
        {
            result.add(matrix[rs][i]);
        }
        rs++;

        for(int i=rs;i<=re;i++)
        {
            result.add(matrix[i][cle]);
        }
        cle--;
 if(rs<=re){
        for(int i=cle;i>=cls;i--)
        {
            result.add(matrix[re][i]);
        }
        re--;
 }

   if(cls<=cle) {
        for(int i=re;i>=rs;i--)
        {
            result.add(matrix[i][cls]);
        }
        cls++;}
       
        }
        return result;
        
     } 
        }