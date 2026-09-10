class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        freqmap = [0] * 26

        for char in s:
            index = ord(char) - ord('a')
            freqmap[index] += 1

        for char in t:
            index = ord(char) - ord('a')
            freqmap[index] -= 1

        for char in freqmap:
            if char != 0:
                return False
        
        return True