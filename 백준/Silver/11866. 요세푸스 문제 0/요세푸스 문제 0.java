import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1 ~ N 삽입
        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        sb.append("<");

        while(true) {

            if(queue.size() == 1) break;

            for(int i = 0; i < K-1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">");

        bw.write(sb.toString());
        bw.flush();

    }
}
