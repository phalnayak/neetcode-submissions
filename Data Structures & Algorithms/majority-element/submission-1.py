class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        nums.sort()
        length = len(nums)
        index = length // 2
        return nums[index]
        