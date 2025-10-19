class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=0;
        for(int p:piles){
            r=Math.max(r,p);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            long h1=0;
            for(int p:piles){
                h1+=(p+mid-1)/mid;
            }
            if(h1<=h){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}