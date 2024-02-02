class Solution {
    public int solution(String myString, String pat) {
        String newString = "";

        for(char c : myString.toCharArray()) {
            if (c == 'A') newString += 'B';
            else newString += 'A';
        }

        if(newString.contains(pat)) return 1;
        else return 0;
    }
}