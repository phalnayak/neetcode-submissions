class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        my_dict = {}

        for num in nums:
            if num in my_dict:
                my_dict[num] = my_dict.get(num) + 1
            else:
                my_dict[num] = 1

        my_dict = sorted(my_dict.items(), key=lambda item: item[1], reverse=True)
        my_dict = my_dict[:k]

        result = []
        for num in my_dict:
            result.append(num[0])  

        
        return result


        