import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static int solution(int n, ArrayList<Integer> arr ) {

        int answer = 0;

        if (n == 1) return answer;

        int dasom = arr.get(0);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 1; i < n; i++) {
            pq.add(arr.get(i));
        }

        // 다른 후보들이 다솜이보다 표가 많으면 매수
        while (pq.peek() >= dasom) {
            int current = pq.poll();
            current--;
            dasom++;
            answer++;
            pq.add(current);
        }

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        bw.write(sb.append(solution(n, arr)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}
