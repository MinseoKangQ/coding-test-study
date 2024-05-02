import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static StringBuilder solution(String command, int n, String arrStr) {

        StringBuilder answer = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        // arrStr 처리
        arrStr = arrStr.substring(1, arrStr.length()-1);
        if(!arrStr.isEmpty()) {
            String[] numArr = arrStr.split(",");
            for(int i = 0; i < numArr.length; i++) {
                deque.addLast(Integer.parseInt(numArr[i]));
            }
        }

        boolean reverse = false;

        // 명령어 처리
        for(char c : command.toCharArray()) {

            if (deque.isEmpty() && c == 'D') // 비어있는데 삭제하려고 하면 에러
                return answer.append("error");

            if (c == 'R') { // 뒤집기
                reverse = !reverse;
            } else { // 삭제
                if (reverse) {
                    deque.removeLast(); // 뒤집혔으면 마지막 요소 삭제
                } else {
                    deque.removeFirst(); // 뒤집히지 않았으면 첫번째 요소 삭제
                }
            }
        }

        answer.append("[");

        // 결과 만들기
        if (reverse) { // 뒤집힌 상태라면
            while (!deque.isEmpty()) {
                answer.append(deque.removeLast()); // 뒤에서부터 가져오기
                if(!deque.isEmpty()) {
                    answer.append(",");
                }
            }
        }

        else {
            while(!deque.isEmpty()) {
                answer.append(deque.removeFirst()); // 앞에서부터 가져오기
                if(!deque.isEmpty()) {
                    answer.append(",");
                }
            }
        }

        answer.append("]");

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

        for(int i = 0; i < T; i++) {

            String command = br.readLine(); // 명령어
            int n = Integer.parseInt(br.readLine()); // 배열 요소의 개수
            String arrStr = br.readLine(); // 배열 요소들

            sb.append(solution(command, n, arrStr)).append("\n");

        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
