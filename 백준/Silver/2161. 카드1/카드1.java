import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int pollNum;
        int peekNum;
        for(int i = 0 ; i < N; i++) {
                pollNum = queue.poll();
                sb.append(pollNum).append(" ");

            if(queue.peek() != null) {
                peekNum = queue.poll();
                queue.offer(peekNum);
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
