class Solution {
    public int[] solution(long n) {
        
        long m = n;
        int indexNum = 0;
        
        while(m != 0) {
            m /= 10;
            indexNum++;
        }
        
        int answer [] = new int [indexNum];
        
        m = n;
        for(int i = 0; i < indexNum; i++) {
            answer[i] = (int)(m % 10);
            m /= 10;
        }
        
        
        
        return answer;
    }
}