class Solution {
    public int solution(int n) {
        int answer = n;
        
        for(int x = 1; x < n; x++) {
            if(n % x == 1) {
                answer = x;
                break;
            }
        }
        return answer;
    }
}