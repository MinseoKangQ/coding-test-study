import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static long solution(int n, ArrayList<Long> arr) {

        long answer = 0;

        Collections.sort(arr);
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            pq.add(arr.get(i));
//            if (arr.get(i) - (i+1) != 0) {
//                answer += Math.abs(arr.get(i) - (i+1));
//            }
        }

        for(int i = 0; i < n; i++) {
            answer += Math.abs(pq.poll() - (i+1));
        }

        return answer;

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Long> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            arr.add(Long.parseLong(br.readLine()));
        }

        bw.write(sb.append(solution(N, arr)).toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
