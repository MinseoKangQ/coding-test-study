class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char includeAlpha [] = {'p', 'P', 'y', 'Y'};
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == includeAlpha[0] || s.charAt(i) == includeAlpha[1])
                pCount++;
            else if(s.charAt(i) == includeAlpha[2] || s.charAt(i) == includeAlpha[3])
                yCount++;
            // System.out.println(s.charAt(i));
        }
        
        if(pCount != yCount) answer = false;
        
        return answer;
    }
}