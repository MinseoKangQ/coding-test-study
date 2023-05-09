import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            queue.offer(i); // 삽입
        }

        while(true) {
            if(queue.size() == 1) break;
            queue.poll(); // 삭제
            queue.offer(queue.poll()); // 맨 앞의 것을 삭제하고 그 값을  삽입
        }

        System.out.println(queue.poll());

    }
}
