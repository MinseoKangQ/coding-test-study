import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static String solution(Queue[] queues, int n, String canMakeThis) {

        String answer = "Possible";
        String [] wordArr = canMakeThis.split(" "); // 단어 단위로 쪼개기
        Queue<String> queueArr = new LinkedList<>();

        for(String s : wordArr) {
            queueArr.offer(s);
        }

        for(int i = 0; i < wordArr.length; i++) {
            String word = queueArr.poll(); // 찾을 단어 꺼내기
            boolean found = false;

            for(int j = 0; j < n; j++) {
                if (!queues[j].isEmpty() && queues[j].peek().equals(word)) { // 찾았다면
                    queues[j].poll(); // 해당 큐에서 꺼내기
                    found = true;
                    break;
                }
            }

            // 찾지 못했다면 해당 단어가 없는것
            if (!found) {
                answer = "Impossible";
                break;
            }
        }

        for(Queue<String> q : queues) {
            if (!q.isEmpty()) { // 비어있지 않으면 문장을 만들 수 없는 것
                answer = "Impossible";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Queue<String>[] queues = new Queue[n];

        for(int i = 0 ; i < n; i++) {
            queues[i] = new LinkedList<>();
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            while(st.hasMoreTokens()) {
                queues[i].offer(st.nextToken());
            }
        }

        String canMakeThis = br.readLine();

        bw.write(solution(queues, n, canMakeThis));
        bw.flush();

        bw.close();
        br.close();
    }
}
