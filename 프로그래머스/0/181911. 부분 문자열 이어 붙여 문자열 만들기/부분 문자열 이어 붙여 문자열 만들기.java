class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        System.out.println(parts[0][0]);
        System.out.println(parts[0][1]);
        for(int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }

        return answer;
    }
}