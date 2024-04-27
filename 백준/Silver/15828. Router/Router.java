import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int routerSize = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        while(true) {

            // 입력 받기
            int x = Integer.parseInt(br.readLine());
            if (x == -1) break; // -1 이면 끝

            // 큐에 패킷 쌓임
            if (x > 0 && queue.size() < routerSize) {
                queue.offer(x);
            }

            // 패킷이 처리됨
            else if (x == 0) queue.poll();

        }

        if (queue.isEmpty()) sb.append("empty");
        else {
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                sb.append(queue.poll()).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }
}
