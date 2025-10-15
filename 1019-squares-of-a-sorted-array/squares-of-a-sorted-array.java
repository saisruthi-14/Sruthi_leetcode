class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int a[]=new int[n];
        int l=0,r=n-1,k=n-1;
        while(l<=r){
            int left=nums[l]*nums[l];
            int right=nums[r]*nums[r];
            if(left>right){
                a[k--]=left;
                l++;
            }else{
                a[k--]=right;
                r--;
            }
        } 
        return a;
    }
}