class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        
        if(numbers.length == 10) answer = -1;
        else {
            for(int i = 0; i < 10; i++) {
                boolean isMatch = false;
                for(int j = 0; j < numbers.length; j++) {
                    if(numbers[j] == i) {
                        isMatch = true;
                        continue;
                    }
                }
                if(!isMatch) sum += i;
            }    
            
            answer = sum;
        }
        return answer;
    }
}