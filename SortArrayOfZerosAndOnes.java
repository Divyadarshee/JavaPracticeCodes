/* My Solution:
*public class Solution {
*    public int[] solve(int[] A) {
*        int n = 0;
*        int m = A.length-1;
*        while(n<m) {
*            if(A[n] == 0 && A[m] == 0){
*                n++; continue;
*            }
*            if(A[n]==1 && A[m]==1){
*                m--; continue;
*            }
*            if(A[n] == 0 && A[m]==1){
*                n++;m--;
*            }
*            else{
*                A[n]=0;A[m]=1;
*                n++;m--; continue;
*            }
*        }
*        return A;
*    }
*} */

public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int [] B = new int[n];
        int a = 0;
        Arrays.fill(B, 1);
        for(int i = 0; i < n; ++i){
            if(A[i] == 0){
                B[a] = 0;
                ++a;
            }
        }
        return B;
    }
}
