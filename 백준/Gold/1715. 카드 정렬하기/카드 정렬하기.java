import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static int solution(ArrayList<Integer> arr) {

        int answer = 0;

        Collections.sort(arr); // 오름차순 정렬
        PriorityQueue<Integer> pQ = new PriorityQueue<>(arr); // 작은 값 우선순위

        if(arr.size() == 1) {
            return 0;
        }

        while(!pQ.isEmpty()) { // pQ가 비어있지 않을 때만

            if(pQ.size() == 1) break;

            Integer a = pQ.poll();
            Integer b = pQ.poll();

            answer += a + b;

            pQ.offer(a+b);

        }


        return answer;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            arr.add(n);
        }

        bw.write(sb.append(solution(arr)).toString());
        bw.flush();

        bw.close();
        br.close();

    }
}
