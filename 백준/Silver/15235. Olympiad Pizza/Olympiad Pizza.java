import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static String solution(LinkedList<int []> queue, int n) {

        int [] answer = new int[n];

        int time = 0;

        while(!queue.isEmpty()) { // 큐가 빌 때 까지 반복

            time++; // 일단 시간 증가

            // 큐에서 첫번째 요소 꺼내기
            int[] current = queue.poll();

            if (current[1] - 1 == 0) { // 피자 다 먹음
                answer[current[0]] = time; // 해당 인덱스 위치에 피자를 먹는데까지 걸린 시간 넣기
            }

            else { // 아직 피자 더 먹어야 하면
                queue.offer(new int[] {current[0], current[1]-1});
            }

        }

        for(int i : answer) {
            sb.append(i).append(" ");
        }

        return sb.toString();

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        LinkedList<int[]> queue = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < n; i++) {
            // [0] 은 인덱스 번호, [1]은 필요한 피자의 수
            queue.offer(new int[] { i, Integer.parseInt(st.nextToken())});
        }

        bw.write(solution(queue, n));
        bw.flush();

        bw.close();
        br.close();
    }
}
