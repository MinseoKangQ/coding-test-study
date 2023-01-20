class Solution {
    public String solution(String s) {
        String answer = "";
        int min;
        int max;
        
        String strArr[] = s.split(" ");
        int intArr [] = new int [strArr.length];
        
        for (int i = 0; i<strArr.length; i++) {
            
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        max = intArr[0];
        min = intArr[0];
        
        for(int i = 1; i<strArr.length; i++) {
            if(intArr[i] > max) max = intArr[i];
        }
        
        for(int i = 1; i<strArr.length; i++) {
            if(intArr[i] < min) min = intArr[i];
        }
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        
        return answer;
    }
}