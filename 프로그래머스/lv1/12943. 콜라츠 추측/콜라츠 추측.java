class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(true) {
            if(num == 1) {
                break;
            }
            else if(num < 0){
                answer = -1;
                break;
            }
            else if(num % 2 == 0) {
                num /= 2;
                answer++;
            }
            else if(num % 2 != 0  && num != 1) {
                num = num*3 + 1;
                answer++;
            }
            else if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }
}