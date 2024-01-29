class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string).reverse();
        sb = sb.delete(n, my_string.length()).reverse();
        answer = sb.toString();

        return answer;
    }
}