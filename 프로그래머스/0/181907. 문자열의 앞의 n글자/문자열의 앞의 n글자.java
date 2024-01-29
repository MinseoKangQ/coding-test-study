class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        StringBuilder sb = new StringBuilder(my_string);
        sb = sb.delete(n, my_string.length());
        answer = sb.toString();

        return answer;
    }
}