/* My Solution:
*public class Solution {
*    public int solve(int[] A) {
*        Arrays.sort(A);
*        return A[0]+A[(A.length-1)];
*    }
 } */


public class Solution {
    public int solve(int[] A) {
        
        int[] res = divideAndSolve(A);
        return res[0]+res[1];
    }
    
    
    /**
     * Return an array of 2 elements with min element of the entire array at 0th index 
     * and max element of the entire array at 1st index. 
     */
     
    private int[] divideAndSolve(int[] A){
        
        int n = A.length;
        int[] ret = new int[2];
        if(n==1){
            
            ret[0]=A[0];
            ret[1]=A[0];
            
        }else{
            int[] lr = divideAndSolve(Arrays.copyOfRange(A, 0, n/2));
            int[] rr = divideAndSolve(Arrays.copyOfRange(A, n/2, n));
            ret[0]=Math.min(lr[0],rr[0]);
            ret[1]=Math.max(lr[1],rr[1]);
        }
        return ret;
      
      
