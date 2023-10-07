class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++) {
            char current = my_string.charAt(i);
            
            try {
                int value = Character.getNumericValue(current);
                if(value >= 1 && value <= 9)
                    answer = answer + value;
            } catch (Exception e) {
                
            }
        }
        
        return answer;
    }
}