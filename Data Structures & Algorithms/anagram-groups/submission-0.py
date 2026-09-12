class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        my_dict = {}

        for str in strs:
            sorted_string = ''.join(sorted(str))

            if sorted_string not in my_dict:
                my_dict[sorted_string] = []
            
            my_dict[sorted_string].append(str)

        return list(my_dict.values())


        