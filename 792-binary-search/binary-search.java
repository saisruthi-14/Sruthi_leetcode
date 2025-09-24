class Solution {
    public int search(int[] nums, int target) {
        int idx=Arrays.binarySearch(nums,target);
        if(idx<0)
        return -1;
        else
        return idx;
    }
}