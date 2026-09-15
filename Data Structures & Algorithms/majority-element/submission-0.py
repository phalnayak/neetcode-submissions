class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majority = len(nums) // 2
        my_dict = {}
        count = 0
        max_num = 0

        for num in nums:
            if num in my_dict:
                my_dict[num] += 1
            else:
                my_dict[num] = 1

        for num in my_dict:
            if my_dict.get(num) > majority:
                return num
            elif my_dict.get(num) >= count:
                count = my_dict.get(num)
                max_num = num

        return max_num
                

            
        

        
        