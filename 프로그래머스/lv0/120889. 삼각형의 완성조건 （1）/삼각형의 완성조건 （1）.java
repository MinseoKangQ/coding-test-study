class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max_length = 0;
        for(int i = 0; i < sides.length; i++) {
            if (sides[i] > max_length)
                max_length = sides[i];
        }
        
        boolean is_max = false;
        int sum = 0;
        for(int i = 0; i < sides.length; i++) {
            if (sides[i] == max_length) {
                if(is_max) {
                    sum += sides[i];
                }
                else {
                    is_max = true;
                    continue;
                }
            }
            sum += sides[i];
        }
        
        if(max_length < sum) answer = 1;
        else answer = 2;
        
        return answer;
    }
}