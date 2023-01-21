import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            if(n >= 10) {
                answer = answer + (n%10);
                n /= 10;
            }
            else {
                answer = answer + (n%10);
                n /= 10;
                break;
            }
        }

        return answer;
    }
}