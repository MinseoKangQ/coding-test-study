import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static String solution(int n, char [] arr) {

        StringBuilder answer = new StringBuilder();

        // 덱으로 생성
        Deque<Character> characterDeque = new ArrayDeque<>();

        characterDeque.add(arr[0]);

        // 1번 인덱스부터 n-1 번 인덱스까지
        for(int i = 1; i < n; i++) {

            Character first = characterDeque.getFirst();
            Character last = characterDeque.getLast();

            char current = arr[i];

            if (current <= first) { // 사전순으로 앞선다
                characterDeque.addFirst(current);
            }
            else {
                characterDeque.addLast(current);
            }

        }

        for(char c : characterDeque) {
            answer.append(c);
        }

        return answer.toString();

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {

            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            str = str.replace(" ", "");

            char[] charArr = str.toCharArray();

            String answer = solution(n, charArr);

            sb.append(answer).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
