import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int answerArrLen = 0;
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                answerArrLen++;
                arrList.add(arr[i]);
            }
        }
        
        if(answerArrLen == 0) {
            int answer [] = new int [1];
            answer[0] = -1;
            return answer;
        }
        
        else {
            arrList.sort(Comparator.naturalOrder());

            Iterator<Integer> arrListIt = arrList.iterator();

            int answer [] = new int [answerArrLen];
            int indexNum = 0;
            while(arrListIt.hasNext()) {
                answer[indexNum] = arrListIt.next();
                indexNum++;
            }
            return answer;
        }
    }
}