class Solution:
    def maxSubArray(self, nums):
        current_sum = 0
        maxi = float('-inf')

        for num in nums:
            current_sum += num
            maxi = max(maxi, current_sum)

            if current_sum < 0:
                current_sum = 0

        return maxi

        