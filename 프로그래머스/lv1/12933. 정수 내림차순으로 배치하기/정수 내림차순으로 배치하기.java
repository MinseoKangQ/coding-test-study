import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String stringOfN = Long.toString(n);
        int arr [] = new int [stringOfN.length()]; 
        ArrayList<Integer> integers = new ArrayList<>(stringOfN.length());
        
        for(int i = 0; i < stringOfN.length(); i++) {
            integers.add(Integer.parseInt(stringOfN.substring(i, i+1)));
        }
        
        integers.sort(Comparator.reverseOrder());
        
        boolean isFirst = true;
        Iterator<Integer> integersIt = integers.iterator();
        
        while(integersIt.hasNext()) {
            if(isFirst) { 
                answer += integersIt.next();
                isFirst = false;
            }
            else {
                answer *= 10;
                answer += integersIt.next();
            }
            System.out.println(answer);
        }        
        return answer;
    }
}