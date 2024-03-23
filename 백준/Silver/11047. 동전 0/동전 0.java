import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int solution(ArrayList<Integer> arr, int remain) {

        Collections.reverse(arr);
        int answer = 0;
        int index = 0;
        int current = arr.get(index);

        while (remain != 0) {
            if (remain < current) {
                index++;
                current = arr.get(index);
            }
            else {
                remain -= current;
                answer++;
            }
        }

        return answer;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            if (A <= K) { // 여기 주의!!
                arr.add(A);
            }
        }

        bw.write(sb.append(solution(arr, K)).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
