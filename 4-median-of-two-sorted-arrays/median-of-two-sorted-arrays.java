class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length,i=0,j=0,c=0;
        int total=n+m;
        int prev=0;
        while(i<n||j<m){
            int val;
            if(j==m||(i<n && nums1[i]<nums2[j])){
                val=nums1[i++];
            }else{
                val=nums2[j++];
            }
           if (total % 2 == 1) { 
                if (c == total / 2) return val;
            } else {
                if (c == total / 2) return (prev + val) / 2.0;
            }
            prev = val;
            c++;
        }
        return -1;
    }
}