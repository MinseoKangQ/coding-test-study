class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int loopLength = myString.length() - pat.length() + 1;
        
        for(int i = 0; i < loopLength; i++) {
            String newString = myString.substring(0, pat.length()); // 0 1 2 잘라서 새로운 문자열로 만든다
            if(newString.equals(pat)) answer++; // 그 문자열이 pat과 같은지 확인한다, 같다면 answer++
            myString = myString.substring(1); // myString을 1 인덱스부터 잘라서 새로운 myString으로

        }

        return answer;
    }
}