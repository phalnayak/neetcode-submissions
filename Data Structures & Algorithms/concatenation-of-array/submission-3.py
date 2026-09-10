class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = [] * 2 * n

        for i in range(2):
            for num in nums:
                ans.append(num)
        # for num in nums:
        #     ans.append(num)

        # for num in nums:
        #     ans.append(num)

        return ans
        