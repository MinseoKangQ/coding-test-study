class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";

        String str1 = my_string.substring(0, s);
        StringBuilder str2 = new StringBuilder(my_string.substring(s, e+1)); // 뒤집어야 하는 문자열
        String str3 = my_string.substring(e+1);

        answer += str1;
        answer += str2.reverse().toString();
        answer += str3;

        return answer;
    }
}