class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_p=0
        min_p=prices[0]
        for i in prices:
            min_p=min(min_p,i)
            profit=i-min_p
            max_p=max(max_p,profit)
                    
        return max_p    

        