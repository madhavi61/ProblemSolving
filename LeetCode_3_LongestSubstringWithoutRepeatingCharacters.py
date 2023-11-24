//https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s)==0:
            return 0
        max=1
        for i in range(len(s)):
            res=[]
            for j in range(i,len(s)):    
                if s[j] not in res:
                    res.append(s[j])
                else:
                    break
            
            if len(res)>max:
                max=len(res)
                
        return max
