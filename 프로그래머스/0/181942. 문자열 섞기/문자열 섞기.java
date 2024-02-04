class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();
        
        for(int i = 0; i < str1.length(); i++) {
            answer += c1[i];
            answer += c2[i];
        }
        return answer;
    }
}