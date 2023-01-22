class Solution {
    public long solution(long n) {
        long answer = -1;
        Double sqrtN = Math.sqrt(n);
        
        if(sqrtN == sqrtN.intValue()) {
            answer = (long)Math.pow(sqrtN+1, 2);
        }
        return answer;
    }
}