class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] x = new int[2];
        x[0]=x[1]=-1;
        if(nums.length==0) return x;
        
        int hi = nums.length -1;
        int lo = 0;
        int mid;
        while(lo+1<hi){
            System.out.println("lo"+lo);
            System.out.println("hi"+hi);
            mid = lo + (hi-lo)/2;
            if(nums[hi]==nums[lo]) break;
            if(nums[mid] == target){
                if(nums[mid]>nums[mid-1])lo=mid;
                else if(nums[lo] != target) lo++;
                if(nums[mid]<nums[mid+1]) hi =mid;
                else if(nums[hi]!= target) hi--;
            }
            else if(nums[mid]>target) hi = mid;
            else lo = mid;
        }
        
        if(nums[lo]==target) {x[0]=lo; x[1]=lo;}
        if(nums[hi]==target) {    
            x[1]=hi;
            if(x[0]==-1) x[0]=hi;
        }
        return x;
    }
}
