class Solution {
    public int solution(String my_string) {
                int answer = 0;
        
        String [] strArr = my_string.split(" "); // [3|+|4], [3|+|4|-|6], [3|+|4|-|6|+9]

        answer = Integer.parseInt(strArr[0]);
        
        for(int i = 1; i < strArr.length; i += 2) {
            if (strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i+1]);
            } else {
                answer -= Integer.parseInt(strArr[i+1]);
            }
        }

        return answer;
    }
}