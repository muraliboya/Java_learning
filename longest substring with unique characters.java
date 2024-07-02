class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        for(int right = 0;right < n;right ++){
            if( ! set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                res = Math.max(res, right - left + 1);
            }else{
                while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left ++;
            }
            set.add(s.charAt(right));
            res = Math.max(res, right - left + 1);
            }

            
        }

        return res;
        
    }
}
